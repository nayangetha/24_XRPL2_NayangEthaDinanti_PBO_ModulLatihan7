/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_7;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Latihan_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner masukan = new Scanner(System.in);
        
        //Input data oleh user pada variabel lokal
        System.out.print("Silahkan pilih angka 1-3 : ");
        int bil = masukan.nextInt();
        //Program swicth case yang dapat dipilih user 
        switch(bil){
            case 1 : System.out.println("Satu");
            break;
            case 2 : System.out.println("Dua");
            break;
            case 3 : System.out.println("Tiga");
            
        }
    }
    
}
