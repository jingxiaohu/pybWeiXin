package com.park.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.park.DataSource.DynamicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class JdbcConfig {

    @Resource(name="dataSource_master")
    DataSource dataSource_master;

    @Bean(name = "dataSource_master")
//    @ConfigurationProperties(prefix = "custom.datasource.ds1")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource_master(){
        return new DruidDataSource();
    }

    @Bean(name="namedParameterJdbcTemplate")
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){

        return new NamedParameterJdbcTemplate(dataSource_master);
    }


    @Resource(name="dataSource_slave")
    DataSource dataSource_slave;

    @Bean(name = "dataSource_slave")
    @ConfigurationProperties(prefix = "custom.datasource.ds2")
    public DataSource dataSource_slave(){ return new DruidDataSource(); }

    @Bean(name="dynamicDataSource")
    public DynamicDataSource makeDynamicDataSource(){
        DynamicDataSource dds = new DynamicDataSource();
        dds.setDefaultTargetDataSource(dataSource_master);
        Map<Object,Object> map = new HashMap<Object,Object>();
        map.put("master",dataSource_master);
        map.put("slave",dataSource_slave);
        dds.setTargetDataSources(map);
        return  dds;
    }


}
