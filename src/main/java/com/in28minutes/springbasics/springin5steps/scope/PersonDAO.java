package com.in28minutes.springbasics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;

//    @Bean
//    public JdbcConnection getJdbcConnection() {
//        return new JdbcConnection();
//    }

    public JdbcConnection getJdbcConnection() { return jdbcConnection; }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
