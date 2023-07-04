/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Entity.TodoList;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



/**
 *
 * @author WIN 10
 */
public class TodoListRepositoryImp implements TodoListRepository {
    private Locale local = new Locale("id","ID");
    private HikariDataSource dataSource;

    public TodoListRepositoryImp(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    
    
    @Override
    public TodoList[] getAll() {
        String sql = "select id, todo, tanggal from todolist";
        
        try(Connection conn = dataSource.getConnection();
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(sql)){
            
            List<TodoList> list = new ArrayList<>();
            while(rs.next()){
                TodoList todo = new TodoList();
                todo.setId(rs.getInt("id"));
                todo.setTodo(rs.getString("todo"));
                
                Timestamp timeStamp = rs.getTimestamp("tanggal");
                if(!rs.wasNull()){
                    todo.setTanggal(timeStamp.toLocalDateTime());
                }
                
                list.add(todo);
            }
            
            return list.toArray(new TodoList[]{});
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }        
    }
    
    @Override
    public void tambah(TodoList todolist) {
        String sql = "insert into todolist(todo, tanggal) values (?,?)";
        try(Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1,todolist.getTodo());
            ps.setTimestamp(2, Timestamp.valueOf(todolist.getTanggal()));
            ps.executeUpdate(); 
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    private boolean isExist(Integer nmr){
        String sql = "Select id from todolist where id = ?";
        try(Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, nmr);
            try(ResultSet rs = ps.executeQuery()){
                if (rs.next()) {
                    return true;
                }else{
                    return false;
                }
            }
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean hapus(Integer nmr) {
        if (isExist(nmr)) {
            String sql = "delete from todolist where id = ?";
            try(Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1, nmr);
                ps.executeUpdate();
                return true;
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }else{
            return false;
        }       
    }
}
