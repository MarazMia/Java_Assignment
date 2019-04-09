package samir_sirs_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class use_of_bufferraeder_and_writer {
    
    public static void main(String[] args) throws IOException,FileNotFoundException{
     
        String[] a = {"rakib","emon","rumi","pulok","ranak","shouharda","habib","arnob","jogada","faysal"};
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        for(int i=0;i<10;i++){
            bf.write(i+1+"th boy is "+a[i]);
            bf.write("\n");
        }
        bf.close();
        
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        
        for(int i=0;i<10;i++){
            System.out.println(br.readLine());
        }
        
    }
    
}
