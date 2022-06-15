import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        //RightT();
        //reverseRightT();
        //Isosceles();


        //倒等腰三角形

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the rows: ");
        int rows = scanner.nextInt();

        for (int i=rows; i>0; i--){


            for (int j=0; j<rows-i; j++){
                System.out.print(" ");
            }

            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();


        }








    }

    private static void Isosceles() {
        //等腰三角形

        for (int i=1; i<=5; i++){

            for (int j=5; j>=i; j--){ //印出空格倒三角形
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

    private static void reverseRightT() {
        //倒直角三角形
        for (int i=1; i<=5; i++){
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void RightT() {
        //直角三角形
        for (int i=1;i<=5;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
