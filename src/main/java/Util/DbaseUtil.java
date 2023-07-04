/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author WIN 10
 */
public class DbaseUtil {
    
    private static HikariDataSource hikariDataSource;
    static{
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setUsername("root");
        config.setPassword("");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/java_todolist");
        
        //poll
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(60*   60*1000);
        hikariDataSource = new HikariDataSource(config);
    }
    
    public static HikariDataSource getDataSource(){
        return hikariDataSource;
    }
}
