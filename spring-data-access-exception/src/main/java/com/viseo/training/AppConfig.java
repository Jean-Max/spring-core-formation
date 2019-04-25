package com.viseo.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import javax.sql.DataSource;


public class AppConfig {

    @Bean
    public DataSource datasource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("MEDIA_FILE.sql")
                .build();
    }

    public static void main(String[] args) {

        // Get the application context and run saveMediaFile method here


    }
}
