package ru.javabegin.backend.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DbService {


//    @Autowired
//    private JdbcTemplate mgwJdbcTemplate;
//
//    @Autowired
//    private Config config;


    @Autowired
    JdbcTemplate mgwJdbcTemplate = new JdbcTemplate();

    @Autowired
    DataBaseConfig dataBaseConfig = new DataBaseConfig();

    //    @Step("Обновление аттрибутов эпизодов в таблице (UPDATE tvh_product.episode SET attrs)")
    public void updateEpisodesAttrs(String email, String id) {
        String sql = "UPDATE user_data SET email="+"'"+email+"'"+"WHERE id="+"'"+id+"'";
//        Object[] params = {attrs, extId};
        dataBaseConfig.jdbcTemplate().update(sql);
    }
}
