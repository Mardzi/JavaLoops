
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kromp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Unesite Godine");
        
        Scanner in = new Scanner(System.in);
        int age2 = in.nextInt();
       
        
        if (age2 >= 18){
            System.out.println("Osoba je punoletna");
        if   (age2<18 && age2>12){
            System.out.println("Osoba je tinejdzer");
        }
        if   (age2<10 && age2>3){
            System.out.println("Osoba je dete");
        }
        } else {
            System.out.println("Bebica");
    }
        
        
       
        //0-2 beba
        //3-10 dete
        //12-17 tinejdzer
        //18+ odrasla osoba.
    }
    
}
