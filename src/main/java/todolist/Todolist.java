/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;
import java.util.Scanner;
public class Todolist {

    public static String[] model = new String[10];
    
    public static void main(String[] args) {
        // TODO code application logic here
        viewlihat();
    }
    public static void tambah(String todo){
        boolean penuh = true;
        
        //apakah model penuh?
        for (var i=0;i<model.length;i++){
            if(model[i]==null){
                penuh = false;
                break;
            }
        }
        // Menambah size
        if(penuh){
            String[] temp=model;
            model = new String[model.length*2];
            for(int i=0 ; i<temp.length;i++){
                model[i]=temp[i];
            }
        }
        for(var i=0;i<model.length;i++){
            if(model[i]==null){
                model[i]=todo;
                break;
            }
        }   
    }
    public static void lihat(){
        for (int i = 0;i<model.length;i++){;
            var todo = model[i];
            var nmr = i+1;
            
            if(todo!=null){
                System.out.println(nmr+". "+todo);
            }
        }
    }
    public static boolean hapus(int nomor){
        if((nomor-1)>=model.length){
            return false;
        }else if((model[nomor-1])==null) {
            return false;
        }else {
            for (int i=(nomor-1);i<model.length;i++){
                if(i==(model.length-1)){
                    model[i]=null;
                }else {
                    model[i]=model[i+1];
                }
            }
            return true;
        }
    }
    public static void viewtambah(){
        String todo;
        System.out.println("Menambah todolist");
        todo = input("todo(3 jika batal)");
        if(todo.equalsIgnoreCase("3")||todo.equalsIgnoreCase("batal")){
            
        }else{
                tambah(todo);
        }
    }
    public static void viewlihat(){
        Scanner sc = new Scanner(System.in);
        boolean kondisi=true;
        String input;
        while(kondisi){
            lihat();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");
            
            String inputdata=input("Pilih aksi ");
            switch(inputdata.toLowerCase()){
                case "1","tambah"-> viewtambah();
                case "2","hapus"-> viewhapus();
                case "3","keluar"-> kondisi= false;
                default -> System.err.println("Maaf pilihan yang anda masukan tidak ada dimenu");
            }
            
        }
    }
    public static void viewhapus(){
        System.out.println("View Hapus todolist");
        String todo = input("nomor yang dihapus(x jika batal)");
        if(todo.equals("x")){
            
        }else{
            boolean succes = hapus(Integer.valueOf(todo));
            if(!succes){
                System.out.println("Gagal menghapus todo "+todo);
            }
        }
    }
    public static String input(String info){
        Scanner sc = new Scanner(System.in);
        System.out.print(info+" : ");
        String inputdata = sc.nextLine();
        return inputdata;
    }
}
