/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.time.LocalDateTime;
/**
 *
 * @author WIN 10
 */
public interface TodolistService {
    void lihat();
    void tambah(String todo, LocalDateTime tanggal);
    void hapus(Integer nomor);
    
}
