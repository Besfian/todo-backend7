package ru.javabegin.backend.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class DataBaseConfig {
    @Autowired
    private DataBasePropert dataBasePropert;
    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataBasePropert.driver);
        dataSource.setUrl(env.getProperty(dataBasePropert.url));
        dataSource.setUsername(env.getProperty(dataBasePropert.username));
        dataSource.setPassword(env.getProperty(dataBasePropert.password));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}


