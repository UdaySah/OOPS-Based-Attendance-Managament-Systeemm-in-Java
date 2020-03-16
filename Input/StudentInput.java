package Input;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
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
 * @author Student
**/
public class StudentInput
{
    
    public void Add(String registrationno, String firstname, String lastname, String address,
            String phoneno, String course, String semester, String intakecode, 
            String gudiencename, String gudiencephoneno,String txtuname,String txtpassword)
    { 
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Users.txt", true))) {
                bw.write(registrationno + "  " + firstname + "  " + lastname + "  " + address  + "  " + phoneno+ 
                        "  " + course + "  " + semester + "  " + intakecode + "  " + gudiencename + "  " + gudiencephoneno + "  " + txtuname + "  " + txtpassword);
                
                bw.flush();
                bw.newLine();

                bw.close();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }   

    public void deleteStudent(String firstname) throws IOException
    {
    String record;

        File tempDB = new File("Users@old.txt");
        File db = new File("Users.txt");

        BufferedWriter bw;
        try (BufferedReader br = new BufferedReader(new FileReader(db))) {
            bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                String split[] = record.split("  ");
                if (split[0].contains(firstname)) {
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

    
        public void Update(String registrationno, String firstname, String lastname, String address,
            String phoneno, String course, String semester, String intakecode, 
            String gudiencename, String gudiencephoneno,String txtuname,String txtpassword)
        { 
          BufferedReader br = null;
            try {
            File newfile = new File("Users.txt");
            File oldfile = new File("Users@old.txt");
            br = new BufferedReader(new FileReader(newfile));
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(oldfile))) {
                String search;
                while ((search = br.readLine()) != null) {
                    String split[] = search.split("  ");
                    if (split[0].contains(registrationno)) {

                        bw.write(registrationno + "  " + firstname + "  " + lastname + "  " + address  + "  " + phoneno+ 
                        "  "+course+"  "+semester+"  "+intakecode+"  "+gudiencename+"  "+gudiencephoneno + "  " + txtuname + "  " + txtpassword);
                    } else {
                        bw.write(search);
                    }

                    bw.flush();
                    bw.newLine();

                }

                br.close();
            }

            if (newfile.delete()) {
                oldfile.renameTo(newfile);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentInput.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
         public void SearchRecord(String intakecode) throws IOException {
    		String record;
    		BufferedReader br = new BufferedReader( new FileReader("Users.txt") );
    		while( ( record = br.readLine() ) != null ) {
    			
    			StringTokenizer st = new StringTokenizer(record,",");
    			if( record.contains(intakecode) ) {
    				JOptionPane.showMessageDialog(null,"|	"+st.nextToken()+"	"+st.nextToken()+" 		"
                                        + ""+st.nextToken()+"			"+st.nextToken()+"                  "
                                        + ""+st.nextToken()+"                  "+st.nextToken()+""
                                        + "                 "+st.nextToken()+"                  "+st.nextToken()+" "
                                                + "                 "+st.nextToken()+"                  "+st.nextToken()+""
                                                + "                 "+st.nextToken()+"                  "
                                                        + ""+st.nextToken()+"                  "+st.nextToken()+"                     |");
    			}	
    		}
    		br.close();
    		
    		
    		
    }
    }
    

