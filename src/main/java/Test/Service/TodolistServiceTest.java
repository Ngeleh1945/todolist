/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test.Service;

import Entity.TodoList;
import Repository.TodoListRepositoryImp;
import Service.TodolistService;
import Service.TodolistServiceImp;


/**
 *
 * @author WIN 10
 */
public class TodolistServiceTest {
    public static void main(String[] args) {
        testhapus();
    }
    public static void testLihatTodolist(){
        /*TodoListRepositoryImp todoListRepository = new TodoListRepositoryImp();
        todoListRepository.data[0] = new TodoList("Belajar Bahasa Java");
        todoListRepository.data[1] = new TodoList("Belajar Bahasa Java OOP");
        todoListRepository.data[2] = new TodoList("Belajar Bahasa Java Standard Classes");
        
        TodolistService todolistService = new TodolistServiceImp(todoListRepository);
        todolistService.lihat();    */
    }
    public static void testtambah(){
        /*TodoListRepositoryImp todoListRepository = new TodoListRepositoryImp();
        TodolistService todoListService = new TodolistServiceImp(todoListRepository);
        
        todoListService.tambah("Belajar Bahasa Java");
        todoListService.tambah("Belajar Bahasa Java OOP");
        todoListService.tambah("Belajar Bahasa Java Standard Classes");
        todoListService.lihat();*/
    }
    public static void testhapus(){
        /*TodoListRepositoryImp todoListRepository = new TodoListRepositoryImp();
        TodolistService todoListService = new TodolistServiceImp(todoListRepository);
        
        todoListService.tambah("Belajar Bahasa Java");
        todoListService.tambah("Belajar Bahasa Java OOP");
        todoListService.tambah("Belajar Bahasa Java Standard Classes");
        todoListService.lihat();
        
        todoListService.hapus(5);
        todoListService.hapus(1);
        todoListService.lihat();*/
    }
}
