package backend.contalink.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(usersAPiInfo())
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("backend.contalink.controller"))
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo usersAPiInfo() {
        return new ApiInfoBuilder()
                .title("Api Contalink")
                .version("1.0")
                .license("Grupo Contalink")
                .contact("Grupo Contalink")
                .build();
    }
}
