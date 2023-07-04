/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import java.util.Scanner;
/**
 *
 * @author WIN 10
 */

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);    
    public static String input(String info){
        System.out.print(info+" : ");
        String input = sc.nextLine();
        return input;
    }
    public static String inputTanggal(String info){
        System.out.println(info+" : ");
        String tanggal = sc.nextLine();
        return tanggal;
    }
}
