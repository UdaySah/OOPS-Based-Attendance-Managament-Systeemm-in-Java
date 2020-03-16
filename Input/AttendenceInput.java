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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udays
 */
public class AttendenceInput {
   
    String regno,firstnm,lastnm,subjname,intcode,lecdate,timin,timout,attandance;

    
     public void Add(String regestrationno, String firstname, String lastname, String subjectname,
            String intakecode, String lecturerdate, String timein, String timeout, 
            String attendence)
    { 
        regno=regestrationno;
        firstnm=firstname;
        lastnm=lastname;
        subjname=subjectname;
        intcode=intakecode;
        lecdate=lecturerdate;
        timin=timein;
        timout=timeout;
        attandance=attendence;
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Attendencedetails.txt", true))) {
                bw.write(regestrationno + "  " + firstname + "  " + lastname + "  " + subjectname  + "  " + intakecode+ 
                        "  " + lecturerdate + "  " + timein + "  " + timeout + "  " + attendence);
                
                bw.flush();
                bw.newLine();

                bw.close();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
      public void update(String regestrationno, String firstname, String lastname, String subjectname,
            String intakecode, String lecturerdate, String timein, String timeout, 
            String attendence)
        {
        regno=regestrationno;
        firstnm=firstname;
        lastnm=lastname;
        subjname=subjectname;
        intcode=intakecode;
        lecdate=lecturerdate;
        timin=timein;
        timout=timeout;
        attandance=attendence;
        BufferedReader br = null;
        try {
            File db = new File("Attendencedetails.txt");
            File tempDB = new File("Attendence@old.txt");
            br = new BufferedReader(new FileReader(db));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB))) {
                String record;
                while ((record = br.readLine()) != null) {
                    String split[] = record.split("  ");
                    if (split[0].contains(regestrationno)) {

                        bw.write(regestrationno + "  " + firstname + "  " + lastname + "  " + subjectname  + "  " + intakecode+ 
                        "  " + lecturerdate + "  " + timein + "  " + timeout + "  " + attendence);
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
            Logger.getLogger(AttendenceInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AttendenceInput.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(AttendenceInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
      public void sendMessage(String Message) throws IOException
      {
          File f=new File("SendMessage.txt");
          BufferedWriter bw=new BufferedWriter(new FileWriter(f));
          bw.write(Message);
          bw.close();
          
      }
       public String receiveMessage() throws IOException
      {
          File f=new File("SendMessage.txt");
          BufferedReader br=new BufferedReader(new FileReader(f));
          String size;
          while((size=br.readLine())!=null)
          {
              return size;
          }
          br.close();
         return null;
      }
      
         
      
}
