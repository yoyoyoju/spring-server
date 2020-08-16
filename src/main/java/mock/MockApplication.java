package mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication // Configuration, EnableAutoConfiguration, ComponentScan
public class MockApplication {
    public static void main(String... args) {
        SpringApplication.run(MockApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedOrigins(
                            "https://zzzit.net",
                            "http://zzzit.net", 
                            "https://www.zzzit.net",
                            "http://www.zzzit.net");

            }
        };
    }
}
