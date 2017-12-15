package com.epam.hwIO;


import jdk.nashorn.internal.objects.ArrayBufferView;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;

public class Main {

    static Set<String> keyWord = new HashSet<>();


    public static void ByteIO() {
        String fileName1 = "inFile.txt";
        String fileName2 = "outFile.txt";

        int count;
        int counter = 0;
        byte[] bytesReaded;
        String inputstring;

        try(FileInputStream inFile = new FileInputStream(fileName1);
            FileOutputStream outFile = new FileOutputStream(fileName2);
        ) {
            int bytesAvailable = inFile.available();
            bytesReaded = new byte[bytesAvailable];
            count = inFile.read(bytesReaded, 0, bytesAvailable);

            inFile.close();

            inputstring = new String(bytesReaded, "utf-8");
            String[] words = inputstring.split("[,;:.!?\\s]+");

            for (String tmpString : words) {
                if (keyWord.contains(tmpString)) {
                    counter++;
                    System.out.println(tmpString);
                    outFile.write(tmpString.getBytes());
                    outFile.write(" \n".getBytes());
                }
            }
            outFile.write(ByteBuffer.allocate(4).putInt(counter).array());
            System.out.println(counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SymbolIO() throws FileNotFoundException {
        String s;
        String input = null;
        int counter1 = 0;

        try (FileReader readFile = new FileReader("inFile.txt");
             BufferedReader bufferedReader = new BufferedReader(readFile);
             FileWriter writeFile = new FileWriter("outputFile.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writeFile);){

            bufferedWriter.write(1);
            while ((s = bufferedReader.readLine()) != null) {
                input += s;
            }
            readFile.close();
            String[] words1 = input.split("[,;:.!?\\s]+");
            for (String tmpString : words1) {
                if (keyWord.contains(tmpString)) {
                    counter1++;
                    bufferedWriter.write(tmpString);
                    bufferedWriter.write(" ");
                }
            }
            bufferedWriter.write(counter1);
            bufferedWriter.flush();
            writeFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        keyWord.add("byte");
        keyWord.add("short");
        keyWord.add("int");
        keyWord.add("long");
        keyWord.add("char");
        keyWord.add("float");
        keyWord.add("double");
        keyWord.add("boolean");
        keyWord.add("if");
        keyWord.add("else");
        keyWord.add("switch");
        keyWord.add("case");
        keyWord.add("default");
        keyWord.add("while");
        keyWord.add("break");
        keyWord.add("continue");
        keyWord.add("for");
        keyWord.add("try");
        keyWord.add("catch");
        keyWord.add("finally");
        keyWord.add("throw");
        keyWord.add("throws");
        keyWord.add("private");
        keyWord.add("protected");
        keyWord.add("public");
        keyWord.add("import");
        keyWord.add("package");
        keyWord.add("class");
        keyWord.add("interface");
        keyWord.add("implements");
        keyWord.add("final");
        keyWord.add("void");
        keyWord.add("abstract");
        keyWord.add("native");
        keyWord.add("static");
        keyWord.add("extends");
        keyWord.add("new");
        keyWord.add("return");
        keyWord.add("this");
        keyWord.add("super");
        keyWord.add("synchronized");
        keyWord.add("volatile");
        keyWord.add("const");
        keyWord.add("goto");
        keyWord.add("instanceof");
        keyWord.add("enum");
        keyWord.add("assert");
        keyWord.add("transient");
        keyWord.add("strictfp");
        Main.ByteIO();
        Main.SymbolIO();
    }
}
