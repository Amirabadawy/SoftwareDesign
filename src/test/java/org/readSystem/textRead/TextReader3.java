package org.readSystem.textRead;

import java.io.*;

public class TextReader3 {

    String filePath;
    public void readText3() throws IOException {
        File file = new File(filePath);
        BufferedReader read = new BufferedReader(new FileReader(file));
        String st;
        while ((st = read.readLine()) != null){
            System.out.println(st);
        }

    }


}
