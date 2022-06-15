package Q4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        /*String s = "abc def";
        System.out.println(s);
        System.out.println(s.replaceAll("\\s+",""));*/

        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        s = scanner.nextLine();
        s = s.replaceAll("\\s+" , "").toLowerCase();

        if (recursivePalindrome(s)){
            System.out.println("This is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }




        //reversePalindrome();
    }

    public static boolean recursivePalindrome(String s){

        if (s.length()<2)
            return true;

        if (s.charAt(0) == s.charAt(s.length()-1))
            return recursivePalindrome(s.substring(1, s.length()-1 ));

        return false;
    }




    private static void reversePalindrome() {
        String str, reverse="";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        str = scanner.next();

        for (int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

//        System.out.println(reverse);

        if (str.equals(reverse)){
            System.out.println("This is a palindrome! ");
        }
        else{
            System.out.println("Not a palindrome! ");
        }
    }
}
