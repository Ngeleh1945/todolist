/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Entity.TodoList;

/**
 *
 * @author WIN 10
 */
public interface TodoListRepository {
    TodoList[] getAll();
    void tambah(TodoList todolist);
    boolean hapus(Integer nmr);
    
}
