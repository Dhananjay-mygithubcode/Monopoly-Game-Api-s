package com.monopoly.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI springShopOpenAPI() {
		return new OpenAPI().info(new Info()
						.title("monopoly-game-api")
						.description("Backend APIs for monopoly-game")
						.version("v3.2.5")
						.contact(new Contact()
								.name("Dhananjay Ram")
								.url("https://github.com/Dhananjay-mygithubcode")
								.email("dhananjay2099@gmail.com"))
						.license(new License()
								.name("License")
								.url("/")))
				.externalDocs(new ExternalDocumentation()
						.description("Monopoly-Game App Documentation")
						.url("http://localhost:8080/swagger-ui/index.html"));

	}

}
