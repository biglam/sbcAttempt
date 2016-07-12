package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.test.bookpub.StartupRunner;

@SpringBootApplication
@EnableScheduling
public class BookpubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookpubApplication.class, args);

    }

    @Bean
    public StartupRunner schedulerRunner() {
        return new StartupRunner();
    }


}
