package samir_sirs_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Use_of_bufferreader_and_writer {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        String[] a = {"rakib", "emon", "rumi", "pulok", "ranak", "shouharda", "habib", "arnob", "jogada", "faysal"};
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        for (int i = 0; i < 10; i++) {
            bf.write(a[i] + " ");
            bf.write("\n");
        }
        bf.close();

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        for (int i = 0; i < 10; i++) {
            System.out.println(br.readLine());
        }
         br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            String s;
            String[] words = null;
            int count = 1;
            while((s = br.readLine()) != null) {
                words = s.split(" ");
                for(int i=0; i<words.length; i++) {
                    if(words[i].equals("")) continue;
                    for(int j=i+1; j<words.length; j++) {
                        if(words[i].equals(words[j])) {
                            words[j] = "";
                            count++;
                        }
                    }
                    System.out.println("'" + words[i] + "'" + " is " + count + " times.");
                    words[i] = "";
                    count = 1;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}
