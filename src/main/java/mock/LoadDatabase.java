package mock;

import java.util.Random;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    private static final long dayInSecond = 24 * 60 * 60;

    @Bean
    CommandLineRunner initDatabase(ValueRepository valueRepository) {
        return args -> {
            long unixTime = Instant.now().getEpochSecond();

            Random rd = new Random();
            for (long i=0; i<100; i++) {
                long x = unixTime - i * dayInSecond;
                // log.info("time: " + Instant.ofEpochSecond(x));
                valueRepository.save(new Value(x, rd));
            }

            valueRepository.findAll().forEach(value -> log.info("Preloaded " + value));
        };
    }
}

