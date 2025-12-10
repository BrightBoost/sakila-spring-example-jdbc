package com.pluralsight.demo.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {
    private BasicDataSource dataSource;

    public DbConfig(@Value("${datasource.url}") String url,
                    @Value("${datasource.username}") String username,
                    @Value("${datasource.password}")  String password) {
        this.dataSource = new BasicDataSource();
        this.dataSource.setUrl(url);
        this.dataSource.setPassword(password);
        this.dataSource.setUsername(username);
    }

    @Bean
    public DataSource getDataSource() {
        return dataSource;
    }
}
