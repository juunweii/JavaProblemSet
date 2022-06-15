package Q1;

public class Prime2 {

    public static void main(String[] args) {

        int primeCounter = 0;
        int number=2;

        boolean prime = true;

        while (primeCounter<100) {

            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime == true){
                primeCounter++;
                System.out.println(number);

            }

            number++;
            prime = true;
        }

    }


}
