package Q1;

public class Prime {
    public static void main(String[] args) {

        //answer();


        int primeCounter = 0;
        int number = 2;
        int flag = 1;

        while (primeCounter<100) {

            for (int i = 2; i <= number - 1; i++) {

                if (number % i == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1){
                System.out.println(number);
                primeCounter++;
            }

            number++;
            flag = 1;
        }


    }

    private static void answer() {
        int flag=1,primeCounter=0,start=2;
        while(primeCounter<100){



            for(int j=2;j<=start-1;j++){

                if((start%j)==0){
                    flag=0;
                    break;
                }
            }

            if (flag==1) {
                System.out.print(start + " ");
                primeCounter++;
            }
            start++;
            flag = 1;


        }
    }

}
