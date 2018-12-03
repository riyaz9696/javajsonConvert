import java.util.*;
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;
import java.io.*;
import java.util.Map;
import java.util.HashMap;


class CsvToJson
{

    public static void main(String[] args) throws IOException 
    { 
        // variable declaration 
         
            String line;
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Please Enter your File name");
            // String input 
            String fileName = sc.nextLine(); 
            System.out.println(fileName);
            fr = new FileReader("/home/amoeba/Desktop/JAVAFiles/ipl .csv");
            BufferedReader br=new BufferedReader(fr);
             
            
             String firstline=br.readLine();
            String[] words=firstline.split(",");
           /* for(String w:words){
                System.out.println(w);
            }*/


            int i; 
             while ((line = br.readLine())!=null) {
             String[] newword=line.split(",");
            
            for(i=0;i<=newword.length;i++)
            {
                System.out.println("{");
                System.out.println(""+words[i]+":"+newword[i]);
               System.out.println("}");
            }

           


              }

          /* System.out.println(map);
  */
        } 

        catch (Exception fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        
        // close the file 
        fr.close(); 
    } 
} 