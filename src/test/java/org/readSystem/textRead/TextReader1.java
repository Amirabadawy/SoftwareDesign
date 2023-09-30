package org.readSystem.textRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader1 {

    String filePath;

    public void readTextFile() throws FileNotFoundException {
        File file = new File(filePath);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }
    }
}
