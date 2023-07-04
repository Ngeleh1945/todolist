/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import Repository.TodoListRepository;
import Repository.TodoListRepositoryImp;
import Service.TodolistService;
import Service.TodolistServiceImp;
import Util.DbaseUtil;
import View.ViewTodolist;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;

public class Todolist2 {
    public static void main(String[] args) {
        HikariDataSource ds = DbaseUtil.getDataSource();
        
        TodoListRepository todoListRepository = new TodoListRepositoryImp(ds);
        TodolistService TodoService = new TodolistServiceImp(todoListRepository);
        ViewTodolist viewTodo = new ViewTodolist(TodoService);
        viewTodo.lihat();
    }
}
