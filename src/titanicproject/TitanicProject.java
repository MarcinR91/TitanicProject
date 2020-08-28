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
    
    //essential variables    
    String sex;
    int shipclass;
    int age;
    int chances = 0;
    String ifparent;
    String onlyparent = "no";
        
// application logic here
        Scanner input = new Scanner(System.in);
        // gathering information
        System.out.println("What is your gender?");
        sex = input.nextLine();
        System.out.println("In which class do you travel?");
        shipclass = input.nextInt();
        System.out.println("Are you a parent?");
        ifparent = input.nextLine();
        if(ifparent .equals("yes")){
            System.out.println("Are you single parent?");
        onlyparent = input.nextLine();
        }
        
        System.out.println("What is your age?");
        age = input.nextInt();
        
        
        //logic
        if(sex .equals("female")){
            chances = 5;
        }else{
        chances = 1;
        }
        if(age < 15){
            chances = (chances + 10);
        }
        if(ifparent .equals("yes")){
            chances++;
            if(onlyparent .equals("yes")){
            chances++;
        }
        }
        
        
        if(chances < 5){
        System.out.println("You're chances are very low");
    }else{
       System.out.println("You're safe " + chances);
        }
    }
    
}
