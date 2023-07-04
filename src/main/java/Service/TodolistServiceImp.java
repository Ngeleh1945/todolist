/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.TodoList;
import Repository.TodoListRepository;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author WIN 10
 */
public class TodolistServiceImp implements TodolistService{
    private TodoListRepository todoListRepository;

    public TodolistServiceImp(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }
    
    
    @Override
    public void lihat() {
        TodoList[] model = todoListRepository.getAll();
        System.out.println("TODOLIST");
        
        for (var i:model) {
            System.out.println(i.getId()+". "+i.getTodo()+", Tujuan "+i.getTanggal());
        }        
    }

    @Override
    public void tambah(String todo, LocalDateTime tanggal) {
        TodoList todolist = new TodoList(todo, tanggal);
        todoListRepository.tambah(todolist);
        System.out.println("SUKSES MENAMBAH TODO : " + todo);
        System.out.println("SUKSES MENAMBAH TODO : " + tanggal);
    }
    @Override
    public void hapus(Integer nmr) {
        boolean sukses = todoListRepository.hapus(nmr);
        if(sukses){
            System.out.println("Sukses menghapus TODO : "+nmr);
        } else {
            System.out.println("Gagal menghapus TODO : "+nmr);
        }
    }    
}
