package org.readSystem.textRead;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader2 {

    String filePath;

    public void readText2() throws IOException {
        FileReader fileReader = new FileReader(filePath);
        int i;
        while ((i = fileReader.read()) !=-1){
            System.out.print((char)i);
        }
    }

}
