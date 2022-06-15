package Q3;

import java.util.Scanner;

public class InputPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number =0;


        System.out.println("Please enter a number: ");
        number = scanner.nextInt();

//        int number =5;
        if (isPrime(number) == true) {
            System.out.println("The number is a prime! ");
        } else {
            System.out.println("Not prime!");
        }
    }



    public static boolean isPrime( int number ){

        boolean prime = true;

        if (number == 1 || number<=0){
            prime = false;
        }

        for (int i=2 ; i<= number-1 ; i++){
            if (number%i == 0){
                prime = false;
                break;
            }

        }

        return prime;
    }

}
