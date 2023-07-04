/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

/**
 *
 * @author WIN 10
 */
public class DbaseUtilTest {
    @Test
    void testConnection() throws SQLException{
        HikariDataSource datasource = DbaseUtil.getDataSource();
        Connection conn = datasource.getConnection();
        
        conn.close();
        datasource.close();
    }
}
