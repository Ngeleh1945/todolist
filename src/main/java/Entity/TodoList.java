/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author WIN 10
 */
public class TodoList {
    private Integer id;
    private String todo;
    private LocalDateTime tanggal;
    private Locale local = new Locale("id","ID");

    public TodoList() {
    }
    public TodoList(String todo, LocalDateTime tanggal) {
        this.todo = todo;
        this.tanggal = tanggal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public LocalDateTime getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDateTime tanggal) {
        this.tanggal = tanggal;
    }
   public String getFormattedTanggal() {
        if (tanggal != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss", local);
            return tanggal.format(formatter);
        } else {
            return "Tanggal tidak tersedia";
        }
    }
    
}
