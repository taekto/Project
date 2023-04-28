package com.ssafy.ssafit.config;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

// application.properties 설정 대신 좀더 상세한 설정을 위한 config
@Configuration
@Lazy
//@EnableTransactionManagement
@RequiredArgsConstructor
@MapperScan(basePackages = "com.ssafy.ssafit.dao")
public class mybatisConfig {



}