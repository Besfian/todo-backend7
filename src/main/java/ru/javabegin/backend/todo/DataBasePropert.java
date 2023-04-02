package ru.javabegin.backend.todo;

import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
//@ConfigurationProperties("db")
public class DataBasePropert {

    @NonNull
    @Value(("${spring.datasource.url}"))
    public String url;

    @NonNull
    @Value(("${spring.datasource.username}"))
    public String username;

    @NonNull
    @Value(("${spring.datasource.password}"))
    public String password;

    @NonNull
    @Value(("${spring.datasource.driver-class-name}"))
    public String driver;
}
