package ru.javabegin.backend.todo;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("db")
public class DataBasePropert {

    @NonNull
    public String url;

    @NonNull
    public String username;

    @NonNull
    public String password;

    @NonNull
    public String driver;
}
