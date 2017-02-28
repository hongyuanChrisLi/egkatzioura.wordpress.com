package com.gkatzioura.springdata.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by gkatzioura on 6/2/16.
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource createDataSource() throws Exception {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mls?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("mlsuser");
        dataSource.setPassword("mls123");

        return dataSource;
    }

}
