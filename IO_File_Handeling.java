package samir_sirs_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IO_File_Handeling {
    
    public static void main(String[] args) throws FileNotFoundException,IOException {
        File f = new File("data.html");
        PrintWriter output = new PrintWriter(f);
        output.println("<html><head><h1 align='center'>java is good!</h1></head><body>"
                + "<p>Here comes the glorious moment of SUST."
                + "The name of SWE will shine one day.</p></body></html>");
        output.close();
        
        Scanner input = new Scanner(f);
        String data = input.nextLine();
        System.out.println(data);
        
    }
    
}
