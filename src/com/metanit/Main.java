package com.metanit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("код.txt")){
            int con;
            String txt = null;
            while((con = reader.read()) != -1){
                txt += (char)con;
            }
    String min = txt.replaceAll("\\//.+", "");
    String max = min.replaceAll("/\\*(?s).*?\\*/", "");

            FileWriter writer = new FileWriter("безкоментов.txt");
            writer.write(max);
            reader.close();
            writer.close();
}
catch(IOException ex){
    System.out.println(ex.getMessage());
    }
}}

