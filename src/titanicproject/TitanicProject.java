/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicproject;
import java.util.Scanner;
/**
 *
 * @author marcinr
 */
public class TitanicProject {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String sex;
    int age;
    String ifparent;
    String onlyparent;
        
// TODO code application logic here
        Scanner input = new Scanner(System.in);
        // zbieranie informacji
        System.out.println("What is your gender?");
        sex = input.nextLine();
        System.out.println("What is your age?");
        age = input.nextInt();
        System.out.println("Are you a parent?");
        ifparent = input.nextLine();
        System.out.println("Are you single parent?");
        onlyparent = input.nextLine();
        
    }
    
}
