package ru.nosov;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lesson {

    public static void main(String[] args) throws IOException {

    }
//        File fileOnUnix = new File("/home/username/Documents"); //Unix
//        File fileOnWindows = new File("D:\\Users\\Nosov\\Projects\\IdeaProjects\\JavaBasic\\Lesson11\\Files"); //Unix
//
//
//
//        File picture = new File("D:\\Users\\Nosov\\Projects\\IdeaProjects\\JavaBasic\\Lesson11\\Files\\Generator.jpg"); //Unix
//        System.out.println("File name: " + picture.getName());
//        System.out.println("File path: " + picture.getPath());
//        System.out.println("is file: " + picture.isFile());
//        System.out.println("FIn directory: " + picture.isDirectory());
//        System.out.println("Exists: " + picture.exists());
//        System.out.println("Parent name: " + picture.getParent());

        File file = new File("D:\\Users\\Nosov\\Projects\\IdeaProjects\\JavaBasic\\Lesson11\\Files\\file.txt");
        String path = "D:\\Users\\Nosov\\Projects\\IdeaProjects\\JavaBasic\\Lesson11\\Files\\file1.txt";
//
        File file1 = new File(path);
//        File renamedFile = new File("D:\\Users\\Nosov\\Projects\\IdeaProjects\\JavaBasic\\Lesson11\\Files\\newFile.txt");


        //Чтение для небольших файлов < доступной ОП JVM
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("noo such file: " + file1);
//        }

        // Чтение классом Files.readAllBytes
        //System.out.println(readFile(src/ru/nosov/Lesson.java));


//        //Создание
//        try {
//            boolean created = file.createNewFile();
//            if (created) {
//                System.out.println("File created");
//            } else {
//                System.out.println("File exists");
//            }
//        } catch (IOException e) {
//            System.out.println("not created file: " + file.getPath());
//        }
//
//
//        boolean renamed = file.renameTo(renamedFile);
//        if (renamed) {
//            System.out.println("Renamed");
//        } else {
//            System.out.println("not renamed");
//        }

//        if (file.delete()) {
//            System.out.println("File deleted");
//        } else {
//            System.out.println("Not deketed");
//        }
        //Альтернативное создание - не заработало
        //System.out.println("Create %s: %s%n",file , file.createNewFile());

//        FileWriter writer = new FileWriter(file);
//        writer.write("Anna \n");
//        writer.write("Ivan \n");
//        writer.write("Petya\n");
//        writer.close();

//        //Лучше писать вот так
//        try (FileWriter writer = new FileWriter(file)){
//            writer.write("Anna \n");
//            writer.write("Ivan \n");
//            writer.write("Petya\n");
//        } catch (IOException e) {
//            System.out.printf("Error %s", e.getMessage());
//        }
//        //автоматическки закроет файл
//
//
//        try (PrintWriter printWriter = new PrintWriter(file1)){
//            printWriter.print("Ulala");
//            printWriter.println("Ulala");
//            printWriter.printf("U have %d dollars", 400);
//            printWriter.println(" Ulala");
//            printWriter.print("Ulala");
//
//        } catch (IOException e) {
//            System.out.printf("Error %s", e.getMessage());
//        }
//
//        BufferedReader bufferedReader = null;
//
////        try {
////            File file2 = new File("br.txt");
////
////            if (!file2.exists()){
////                file2.createNewFile();
////            }
////            PrintWriter printWriter = new PrintWriter(file2);
////            printWriter.println("java");
////            printWriter.close();
////
////        } catch ()
//
//
//
//        BufferedReader bufferedReader = null;
//        try {
//            File file = new File("br.txt");
//
//            if(!file.exists())
//                file.createNewFile();
//
//            PrintWriter printWriter = new PrintWriter(file);
//            printWriter.println("java");
//            printWriter.close();
//
//            bufferedReader = new BufferedReader(new FileReader("br.txt"));
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error" + e.getMessage());
//        } finally {
//            try {
//                assert bufferedReader != null;
//                bufferedReader.close();
//            } catch (IOException e) {
//                System.out.println("Error " + e.getMessage());
//            }
//        }
//
//
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("test.txt"));
//        } catch(IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//
//        finally {
//            try {
//                assert br != null;
//                br.close();
//            }
//            catch(NullPointerException e) {
//                System.out.println("file didnt exist");
//            }
//            catch(IOException e) {
//                System.out.print("Error: " + e.getMessage());
//            }
//
//
//    }
//
//
//    public static String readFile(String fileName) throws IOException {
//        return new String(Files.readAllBytes(Paths.get(fileName)));
//    }
    }

