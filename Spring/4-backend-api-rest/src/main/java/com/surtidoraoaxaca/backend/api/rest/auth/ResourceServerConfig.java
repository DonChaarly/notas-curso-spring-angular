package com.surtidoraoaxaca.backend.api.rest.auth;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	// El siguiente metodo nos permite implementar todas las reglas de seguridad de
	// nuestros endpoints
	// De nuestras rutas hacia los recursos del controlador
	@Override
	public void configure(HttpSecurity http) throws Exception {

		// Lo unico que es obligatorio tener es la linea de permitAll() y la de
		// anyRequest().authenticated();
		// Tambien la de .and().cors().configurationSource(corsConfigurationSource());
		// Todo lo demas se puede configurar con anoaciones en el controlador

		// Con authorizeHttpRequest().antMatchers() se establece un recurso para
		// usuarios autenticados y no autenticados
		// En el metodo antMatchers se colocan 2 parametros el primero el metodo para la
		// ruta, y el segundo la ruta del recurso
		// Si solo se coloca la ruta, esto quiere decir que esta vale para todos los
		// tipos de metodos
		// Despues de esto se coloca a quienes se les dara acceso con el metodo
		// correspondiente
		// Los dos ** en una ruta significa que el permiso vale para la ruta indicada y
		// todas las demas que tengan algo despues
		// El metodo .hasEnyRole nos sirve para indicar mas de un role, el hasRole para
		// solo un role
		// Se recomienda partir de lo mas especifico a lo mas generico
		// Siempre se coloca al final .anyRequest().authenticated(); para decir que para
		// cualquier otra peticion, se debe estar autenticado
		http.authorizeRequests()
				.antMatchers(HttpMethod.GET, "/api/clientes", "/api/clientes/page/**", "/api/uploads/img/**",
						"/images/**")
				.permitAll()
				/*
				 * .antMatchers(HttpMethod.GET, "/api/clientes/{id}").hasAnyRole("USER",
				 * "ADMIN") .antMatchers(HttpMethod.POST,
				 * "/api/clientes/upload").hasAnyRole("USER", "ADMIN")
				 * .antMatchers(HttpMethod.GET, "/api/clientes/{id}").hasAnyRole("USER",
				 * "ADMIN") .antMatchers(HttpMethod.POST, "/api/clientes").hasRole("ADMIN")
				 * .antMatchers("/api/clientes/**").hasRole("ADMIN")
				 */
				.anyRequest().authenticated()
				.and().cors().configurationSource(corsConfigurationSource());

	}

	// El import de CorsConfigurationSource debe ser la que no dice .reactive
	// En este metodo se configura el CORS de la aplicacion
	// Con setAllowedOrigins se establecen los dominios de los clientes que seran
	// capaces de conectarse con el backend
	// Con setAllowedMethods se establecen los metodo que se permitiran
	// Con setAllowCredentials Se establecen si se permitiran credenciales
	// Con setAllowedHeaders se establecen las cabeceras que se permitiran
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Content-type", "Authorization"));

		// Con UrlBasedCorsConfiguration establecemos el cors y las rutas, /** significa
		// que sera para todas las rutas
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
	
	//Este meodo crea un filtro al cual le pasamos la configuracion de arriba y se establece un orden
	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter(){
		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(corsConfigurationSource()));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}

}
