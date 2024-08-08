package Buoi3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Buoi3 {

    public static void main(String[] args) {

        //Try catch
        System.out.println();
        System.out.println("Try catch");
        try{
            int[]arr = new int[5];
            arr[4] = 7 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Out of range!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }

        System.out.println("\n\n");
        //Regex
        String regex = "^[a-zA-Z0-9]{6,12}$";
        Pattern pattern = Pattern.compile(regex);

        String input = "VietHoang";
        String inputTwo = "I'm god!";
        Matcher matcher = pattern.matcher(input);
        boolean check = matcher.matches();
        if(check){
            System.out.println("Success!");
        }
        else {
            System.out.println("Fail!");
        }

        matcher = pattern.matcher(inputTwo);
        check = matcher.matches();
        if(check){
            System.out.println("Success!");
        }
        else {
            System.out.println("Fail!");
        }

        //lambda
        System.out.println("\n\n");
        System.out.println("lambda");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        //lam viec voi File
        System.out.println("\n\n");
        System.out.println("Work with file");
        File file = new File("src/main/java/Buoi3/data.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n");
        System.out.println("Write File");
        try {
            FileWriter fileWriter = new FileWriter("src/main/java/Buoi3/data.txt", true);
            fileWriter.write("I'M GOODBOY!\n");
            System.out.println("Write success!");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n\n");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}
