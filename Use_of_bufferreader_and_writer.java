package samir_sirs_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Use_of_bufferreader_and_writer {

    public static void main(String[] args) throws IOException, FileNotFoundException, NullPointerException {

        int res = 0, ans = 0, sum = 0;
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("rakib emon rakib pulok ranak shouharda jogada rakib jogada pulok");
        bf.write("\n");
        bf.close();

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println("your given string is\n" + br.readLine() + "\n\n");

        try {
            br = new BufferedReader(new FileReader("test.txt"));
            String s;
            String[] words = null;
            while ((s = br.readLine()) != null) {
                words = s.split(" ");
                int count = 1;
                sum = words.length;
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals("")) {
                        continue;
                    }
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            words[j] = "";
                            count++;
                        }
                    }
                    res = res + count;
                    System.out.println("'" + words[i] + "'" + " presents " + count + " times.");
                    words[i] = "";
                    sum--;
                    count = 1;
                }
            }
            sum = words.length - sum;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fr1 = new FileReader("test.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String str = br1.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                ans++;
            }
        }
        System.out.println("\n\ntotal words " + res);
        System.out.println("\n\ntotal characters " + ans);
        System.out.println("\n\ntotal uniqe words " + sum);
    }
}
