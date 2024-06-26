package calculaParcelas.api;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                .title("Calcula parcelas API")
                .description("Api de cálculo de parcelas com base na selic acumulada")
                .contact(new Contact().name("Macelo"))
                .version("1.0.0"));
    }
}
