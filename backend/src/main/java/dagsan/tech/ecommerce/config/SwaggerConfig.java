package dagsan.tech.ecommerce.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API REST",
                description = "Tech Ecommerce backend API REST.",
                version = "1.0",
                license = @License(
                        name = "MIT License",
                        url= "https://choosealicense.com/licenses/mit/"),
                termsOfService = "Terms of service",
                contact = @Contact(
                        name = "dagsan",
                        email = "santidaglio@gmail.com",
                        url = "https://dagsan.dev"
                )
        ),
        servers = {
                @Server(
                        description = "Local environment API server",
                        url = "http://localhost:8080"
                )
        }
)
public class SwaggerConfig {}