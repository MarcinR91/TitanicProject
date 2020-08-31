/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicproject;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author marvo
 */
public class TitanicProjectWithFile {
    
   
    public static void main(String[] args) {
      
    //essential variables    
    int females;
    int male;
    String age;
    int chances = 0;
    String ifparent;
    String onlyparent = "no";
        
// read file with data
String csvFile = "C:\\train.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
               
                String[] PassengerId = line.split(cvsSplitBy);
    if(PassengerId[1] .equals(1)){
        if(ifparent[4] .equals("female")){
            females = 1;}else{
            male = 1;
        }          
        }
}    
}      
catch (FileNotFoundException e)         {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br == null) {
               
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Womem survived " + female " and men survived: " + male);
    }
        }
    