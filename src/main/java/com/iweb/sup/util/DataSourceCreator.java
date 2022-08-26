package com.iweb.sup.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.annotation.Resource;

import javax.sql.DataSource;

@Configuration
public class DataSourceCreator {


//    @ConfigurationProperties("spring.datasource")
//    @Qualifier("dataSource")
//    @Bean   // java bean 这个方法 会生成一个 java 的对象
//    public DruidDataSource getDS(){
//        return new DruidDataSource();
//
//    }

    @Resource
    DataSource ds;

//    @Bean
//    public JdbcTemplate getTemplate(@Qualifier("dataSource") DruidDataSource ds){
//        return new JdbcTemplate(ds);
//    }

//    @Bean
//    public JdbcTemplate getTemplate(){
//        return new JdbcTemplate(this.ds);
//    }

}
