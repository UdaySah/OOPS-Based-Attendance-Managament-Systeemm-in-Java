/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author udays
 */
public class StudentSearchDatabase {
    
    public ArrayList<String> getDataFromFile(String filename) throws IOException{
        
        ArrayList<String> fileData = new ArrayList<>();
    FileReader fr;
        try {
            fr = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                fileData.add(line);
            }
            
            
        }catch(FileNotFoundException ex){
            }
        return fileData;
    }
    
    public  void writeToFile(String filename,ArrayList<String> list) {
        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(new File(filename)));
            try (PrintWriter pw = new PrintWriter(buffWriter)) {
                list.stream().map((x) -> {
                    pw.println(x);
                    return x;
                }).forEachOrdered((_item) -> {                            
                    pw.flush();
                });
            }
        } catch (IOException e) {
            
        }
       
    }
}
