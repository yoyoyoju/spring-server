package mock;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ValueRepository valueRepository) {
        return args -> {
            // TODO: Use unix timestamp 

            Random rd = new Random();
            for (long i=0; i<10; i++) {
                valueRepository.save(new Value(i, rd));
            }

            valueRepository.findAll().forEach(value -> log.info("Preloaded " + value));
        };
    }
}

