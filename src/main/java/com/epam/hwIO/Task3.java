package com.epam.hwIO;


import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Task3 {
    public static void Symbol() {
        String fileName3 = "kirillizatext.txt";
        String fileName4 = "outFileKirilliza.txt";

        ArrayList<String> arrayList = new ArrayList();
        String inputStringKirilliza;


        try( FileReader fileReader = new FileReader(fileName3);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                     new FileInputStream(fileName3), "UTF8"));
             Writer out = new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(fileName4), "UTF16"))
        ) {

            while ((inputStringKirilliza = bufferedReader.readLine()) != null) {
                String[] newInputStringKirilliza = inputStringKirilliza.split("\\n");
                for (int i = 0; i < newInputStringKirilliza.length; i++) {
                    System.out.println(newInputStringKirilliza[i]);
                    arrayList.add(newInputStringKirilliza[i]);
                }
            }
            fileReader.close();
            for (int i = 0; i < arrayList.size(); i++) {
                out.write(arrayList.get(i));
                out.write("\n");
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ByteIO() {
        String fileName3 = "kirillizatext.txt";
        String fileName4 = "outFileKirilliza1.txt";

        int countKirilliza;
        byte[] bytesReadedKirilliza;

        String inputstringKirilliza;


        try(FileInputStream inFileKirilliza = new FileInputStream(fileName3);
            FileOutputStream outFileKirilliza = new FileOutputStream(fileName4)
        ) {
            int bytesAvailableinFileKirilliza = inFileKirilliza.available();

            bytesReadedKirilliza = new byte[bytesAvailableinFileKirilliza];

            countKirilliza = inFileKirilliza.read(bytesReadedKirilliza, 0, bytesAvailableinFileKirilliza);

            inFileKirilliza.close();

            inputstringKirilliza = new String(bytesReadedKirilliza, "utf-8");
            String newinputStringKirilliza = new String(inputstringKirilliza.getBytes(), "UTF-16");
            System.out.println(newinputStringKirilliza);
            System.out.println(inputstringKirilliza);
            outFileKirilliza.write(newinputStringKirilliza.getBytes());
            outFileKirilliza.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task3.Symbol();
        Task3.ByteIO();
    }
}
