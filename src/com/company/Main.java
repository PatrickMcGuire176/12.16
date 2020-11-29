package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.io.File file = new File("HelloWorld.txt");
        try(Scanner scanner = new Scanner(file)){
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            while (scanner.hasNextLine()){
                if (scanner.nextLine().equals("a")){
                    printWriter.append('z');
                }
            }
           printWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
