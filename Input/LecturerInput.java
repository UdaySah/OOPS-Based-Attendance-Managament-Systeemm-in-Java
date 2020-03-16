package Input;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uday
**/
public class LecturerInput
{
    
    public void Add(String lecturerno,String firstname,String lastname,String address,String mobileno,String course,String txtuname,String txtpassword)
    { 
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("LecturerUsers.txt", true))) {
                bw.write(lecturerno + "  " + firstname + "  " + lastname + "  " + mobileno + 
                        "  " + course + "  " + txtuname + "  " + txtpassword);
                
                bw.flush();
                bw.newLine();

                bw.close();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }   

    public void deleteLecturer(String lecturerno) throws IOException
    {
        String record;

        File tempDB = new File("Users@old.txt");
        File db = new File("LecturerUsers.txt");

        BufferedWriter bw;
        try (BufferedReader br = new BufferedReader(new FileReader(db))) {
            bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                String split[] = record.split("  ");
                if (split[0].contains(lecturerno)) {
                    continue;
                }

                bw.write(record);
                bw.flush();
                bw.newLine();

            }
        }
        bw.close();

        if (db.delete()) {
            tempDB.renameTo(db);
        } else {
            JOptionPane.showMessageDialog(null, "Error Occured");
        }

    }
        
 
       

    
        public void update(String lecturerno,String firstname,String lastname,String address,String mobileno,String course,String txtuname,String txtpassword)
        {
        BufferedReader br = null;
        try {
            File db = new File("LecturerUsers.txt");
            File tempDB = new File("User@old.txt");
            br = new BufferedReader(new FileReader(db));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB))) {
                String record;
                while ((record = br.readLine()) != null) {
                    String split[] = record.split("  ");
                    if (split[0].contains(lecturerno)) {

                        bw.write(lecturerno + "  " + firstname + "  " + lastname + "  " + mobileno + 
                        "  " + course + "  " + txtuname + "  " + txtpassword);
                    } else {
                        bw.write(record);
                    }

                    bw.flush();
                    bw.newLine();

                }

                br.close();
            }

            if (db.delete()) {
                tempDB.renameTo(db);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturerInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturerInput.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturerInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
    

