package Entity;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Guest 
{
    private String s1; 
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private String s7; 
    private String s8;
    
    private File file;
    private FileWriter fwriter;
    
    public Guest() { }
    public Guest(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8)
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
    }
    public void insertInfo()
    {
        try 
        {
            file = new File("./Data/guestdata.txt");
            if (!file.exists()) {
                file.getParentFile().mkdirs(); 
                file.createNewFile(); 
            }
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            String timeAndDate = myDateObj.format(myFormatObj);
            
            fwriter = new FileWriter(file, true);
            fwriter.write("Date and Time: " + timeAndDate + "\n");
            fwriter.write("========================================================" + "\n");
            fwriter.write("Name: " + s1 + "\n");
            fwriter.write("Contact: " + s2 + "\n");
            fwriter.write("NID: " + s3 + "\n");
            fwriter.write("Gender: " + s4 + "\n");
            fwriter.write("Room Type: " + s5 + "\n");
            fwriter.write("Services: " + s6 + "\n");
            fwriter.write("Room View: " + s7 + "\n");
            fwriter.write("Comments: " + s8 + "\n");
            fwriter.write("--------------------------------------------------------" + "\n");
            fwriter.flush();
            fwriter.close();
        }
        catch(IOException ioe) 
        {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error writing to file!");
        }
    }
}