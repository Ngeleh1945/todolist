/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Entity.TodoList;
import Util.DbaseUtil;
import com.zaxxer.hikari.HikariDataSource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 *
 * @author WIN 10
 */
public class todolistRepositoryImpTest {
    private HikariDataSource ds;
    private TodoListRepository todolistRepository;
    private Locale local = new Locale("id","ID");
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
    
    @BeforeEach
    void setUp(){
        ds = DbaseUtil.getDataSource();
        todolistRepository = new TodoListRepositoryImp(ds);
    }
    
    @Test
    void testTambah() throws ParseException{
        TodoList todo = new TodoList();
        todo.setTodo("Madang");
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = simpleDateFormat.parse("05-07-2023 19:00:25");
        LocalDateTime local = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        todo.setTanggal(local);
        todolistRepository.tambah(todo);
    }
    
    @Test
    void testHapus(){
        System.out.println(todolistRepository.hapus(5));
    }
    
    @Test
    void testGetAll(){
        
        TodoList[] todolist = todolistRepository.getAll();
        for (var todo:todolist) {
            System.out.println(todo.getId()+". "+todo.getTodo()+", Tujuan "+todo.getFormattedTanggal());
        }
    }
    
    @AfterEach
    void tearDown(){
        ds.close();
    }
    
    
}
