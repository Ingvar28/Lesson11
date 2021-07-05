package ru.nosov;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "Files\\file.txt";
        String path2 = "Files\\file2.txt";
        String copyFilePath = "Files\\copyFile.txt";
        String catalogPath = "Files";



        try {
            File file = new File(path);

            if(!file.exists())
                file.createNewFile();

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("java");
            printWriter.println("not");
            printWriter.println("simple");
            printWriter.println("to");
            printWriter.println("understanding");
            printWriter.close();
        } catch (IOException e) {
            System.out.printf("Error %s", e.getMessage());
        }

        //Task1
        System.out.println("Task1: \r");
        System.out.println(readFile(path));

        //Task2
        String writeLine = "But I am a diligent student";
        writeToFile(path2,writeLine);

        //Task3
        mergeTextFiles(path,path2);

        //Task4
        copyFile(path,copyFilePath);

        //Task5
        System.out.println("Task5: \r");
        System.out.println(fileFinder(catalogPath, "file").toString());

        //Task6
        System.out.println("Task6: \r");
        System.out.println(fileNameFilter(catalogPath, "java").toString());




    }

    //Task1
    public static String readFile(String file) {
        BufferedReader br;
        StringBuilder result = new StringBuilder(" ");
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null)
                result.append(line).append("\n");
            br.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return result.toString();
    }

    //Task2
    public static void writeToFile (String file, String textToWrite) throws IOException {
        try (FileWriter writer = new FileWriter(file)){
            writer.write(textToWrite);

        } catch (IOException e) {
            System.out.printf("Error %s", e.getMessage());
        }
    }

    //Task3
    public static void mergeTextFiles (String source, String toAdd) throws IOException {

        try {

            FileWriter writer = new FileWriter(source, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("\r" + readFile(toAdd));
            bufferWriter.close();


        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }


    //Task4
    public static void copyFile (String sourceFile, String copyFilePath) throws IOException {

        try {
            File copyFile = new File(copyFilePath);

            if(!copyFile.exists())
                copyFile.createNewFile();

            writeToFile(copyFilePath, readFile(sourceFile));


        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    //Task5
    public static StringBuilder fileFinder (String catalogPath, String line) {
        File catalog = new File(catalogPath);
        StringBuilder targetFiles = new StringBuilder();


            if(!catalog.exists())
                catalog.mkdir();

            for (String lines : catalog.list()) {
                if (lines.contains(line))
                    targetFiles.append(lines + "\n");
            }
        return targetFiles;
    }

    //Task6
    public static StringBuilder fileNameFilter (String catalogPath, String line) {
        File catalog = new File(catalogPath);
        StringBuilder targetFiles = new StringBuilder();


        for (File files : catalog.listFiles()) {

            if (readFile(files.getAbsolutePath()).contains(line))
                targetFiles.append(files.toString() + "\n");
        }
        return targetFiles;
    }





}




