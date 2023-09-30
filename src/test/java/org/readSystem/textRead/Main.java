package org.readSystem.textRead;

import org.readSystem.textRead.TextReader3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        TextReader1 textReader1 = new TextReader1();
//        textReader1.filePath = "src/test/resources/data.txt";
//        textReader1.readTextFile();

//        TextReader2 textReader2 = new TextReader2();
//        textReader2.filePath = "src/test/resources/data.txt";
//        textReader2.readText2();

        TextReader3 textReader3 = new TextReader3();
        textReader3.filePath = "src/test/resources/data.txt";
        textReader3.readText3();

    }
}
