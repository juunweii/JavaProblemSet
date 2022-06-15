package Q5;

import java.io.*;
import java.util.Scanner;

public class SearchFIleWord {

    public static void main(String[] args) {

        File file = new File("data.txt");

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please search a word: ");
        String word = scanner1.next().replaceAll("\\p{Punct}", "").toLowerCase();

//        String word = "a";

        int count = 0;


        Scanner scanner2 = null;
        try {


            scanner2 = new Scanner(file);

            while (scanner2.hasNext()) {
                String clean = scanner2.next().replaceAll("\\p{Punct}", "").toLowerCase();
                if (clean.equals(word)){
                    count++;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Number of times the word appears in the file: "+count);

    }
}
