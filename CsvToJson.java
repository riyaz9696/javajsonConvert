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
            fr = new FileReader("/home/amoeba/Desktop/JAVAFiles/ipl l.csv");

            BufferedReader br=new BufferedReader(fr);

                                
            
             String firstline=br.readLine();
            String[] words=firstline.split(",");
           

            int i; 
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ipl2.json"))) {
             while ((line = br.readLine())!=null) {
             String[] newword=line.split(",");
            
                System.out.println("{");
                 bw.write("{"+"\r\n");
            for(i=0;i<newword.length;i++)
            {

                System.out.println(""+words[i]+":"+newword[i]);
                 bw.write(" "+words[i]+":"+newword[i]+","+"\r\n");

            }
                    bw.write("\r\n"+"}"+",");
               System.out.println("}");

        
              }
              } catch (IOException e) {
                e.printStackTrace();
            }    
        
  
        } 

        catch (Exception fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        
        // close the file 
        fr.close(); 

    } 
} 