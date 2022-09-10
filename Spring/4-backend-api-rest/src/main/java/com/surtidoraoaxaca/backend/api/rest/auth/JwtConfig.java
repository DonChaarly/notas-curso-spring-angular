package com.surtidoraoaxaca.backend.api.rest.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "ejemplo.de.clave.secreta.de.tipo.hs256";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEA2imtRUJKTIR46wO2Nqgjl+BrofkOhpy7Qhn5iuoVyptzpVP9\r\n"
			+ "eAFlkBzsQqxnliV0e4VIFfqb+MRmpswTsBdctNIbIxKaFKw1K8KMN4U6zL9jMFu4\r\n"
			+ "XGyncdYk9nI+gH2izztA1xswU/rghgiy+2m/0y1hgUzzNAQXTyrXQAV2WE2E/B7N\r\n"
			+ "diLrnmnv/ctusJmqBQa61PzOTAiTusl21bzgjLbhkBJS6RQWoOjCb5TkyqBwKU5D\r\n"
			+ "8ac8s0OE+xxo/Ap3Emhp7dw2DT2XLtFN5rV6l0eUrxX9fOkwByi0uL2Llcrk5BwG\r\n"
			+ "55ejTTJhvwME/4hOWMOzokqIkmpn0P3KcQgNLwIDAQABAoIBAFJLunMP6Jsotbxh\r\n"
			+ "sBC6KIMYQ0Hcg6A/61uqFLpUR1ggf+Vz43+rdzZ/0pfsFT9Mbb5Srriryr5yyA5P\r\n"
			+ "mXWpumzzfQ0j7T+zHnOddetTtLSb1bzePJOQ4TFOCK92tSEfQ5VM0s7SEM79Kkkl\r\n"
			+ "au7wG058JfXyoyOSD4DrtjsOVHBGSvsiNcI+GFdfPQPYfeS4bi7NZgDg8pro7oje\r\n"
			+ "WknBNGK6bJ1idAuU9IPKGwCC6M4O/NhPQr7EDaukW3te8byXRGKLoa82uY7I7aHQ\r\n"
			+ "L88fvXYj2cgCFUhrlt1reHsDRMlZxN2kKRiCEoJdW9iQ6Ypw1UzlJCOxP87ybsnN\r\n"
			+ "TWPCL0ECgYEA/zWBfw57bt/OMI+ItLeYdfGe1CRrQaON8OnG2LOSL9yrah0aX/G6\r\n"
			+ "qKgXLem5DgG3EchThxiOZO6EcoENFBuwKG/qWWFUDCdlaDmJRW88tWDQVi6mU+n/\r\n"
			+ "VjOCItiYWH58733Dl4wW+ZQhaZWyIneIPrE3lQBb6CbbaZRplLmz/7ECgYEA2tbG\r\n"
			+ "4iB0KT8EP3ikQQMRCZYSTBBSuEE46EKY1pawKqa8y4OhGJNkHXabSk++YBWFaVI2\r\n"
			+ "P4edTShc1OMeavqk+nhTe10px2JO7pU1S05TN25pU+BOOPzL1A8QpiVcmgkXbRc4\r\n"
			+ "sv2HIoA3xz6T3GMR5TjOB6KvHQLi32A4bh638t8CgYEA02xrNGw1+7tzYK14TmaO\r\n"
			+ "6p7ZutvU81Lgo0W4kwvovrfsVgN4NyXWQiTG1yV6Rk1LcXLpJ9FDHgCvPwEEabUq\r\n"
			+ "ccWNerBz5YG5s+d+fkRSIdzrm4oYBwqimrIfTGjthNp8/BbPM7w9yFNcftEh+wXV\r\n"
			+ "nEJKTqk2epO+T7BA65IQuXECgYBFpR7MblmpmsWGUaWsjwZID7uo+3Tn8NHkkPVF\r\n"
			+ "LdXI7SGefziwso+lFM8dGj3TJGY9+40KMOWt3Y+VrOZMU5JXqB2hYCfgrXfDVDcO\r\n"
			+ "zVGMjZX1vKgIWOOhjF3XEoLi/su2yzIfPLJaF4Yo4dB6zgiu86IWKf8i830ya9Pp\r\n"
			+ "r9sI7wKBgFN40xKzHPb0d5rz5k083MS4Cr9kifnQR4ThWmA1LCqh+4vB0gUAYngk\r\n"
			+ "59iSc6EHsvg3etKCfBDu0aLz0Pl5rAgSObjfwjG263Wnz6kIWPH2ZIqZTr8N8Ycm\r\n"
			+ "Yx8DS0ZhBqCLjgmtD6ISSzRa8WubMzMSe/Ke5jpbK63S9TFavX0S\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2imtRUJKTIR46wO2Nqgj\r\n"
			+ "l+BrofkOhpy7Qhn5iuoVyptzpVP9eAFlkBzsQqxnliV0e4VIFfqb+MRmpswTsBdc\r\n"
			+ "tNIbIxKaFKw1K8KMN4U6zL9jMFu4XGyncdYk9nI+gH2izztA1xswU/rghgiy+2m/\r\n"
			+ "0y1hgUzzNAQXTyrXQAV2WE2E/B7NdiLrnmnv/ctusJmqBQa61PzOTAiTusl21bzg\r\n"
			+ "jLbhkBJS6RQWoOjCb5TkyqBwKU5D8ac8s0OE+xxo/Ap3Emhp7dw2DT2XLtFN5rV6\r\n"
			+ "l0eUrxX9fOkwByi0uL2Llcrk5BwG55ejTTJhvwME/4hOWMOzokqIkmpn0P3KcQgN\r\n"
			+ "LwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
