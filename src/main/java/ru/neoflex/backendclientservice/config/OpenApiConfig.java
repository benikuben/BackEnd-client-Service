package ru.neoflex.backendclientservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "BackEnd client Service Api",
                description = "BackEnd client Service", version = "1.0.0",
                contact = @Contact(
                        name = "Kulieva Veronika"
                )
        )
)
public class OpenApiConfig {
}
