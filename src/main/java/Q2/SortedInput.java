package Q2;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;

public class SortedInput {
    public static void main(String[] args) {

//Take n integers from the user as input and print them in a sorted order

        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        count = scanner.nextInt();

        //put elements into array
        int[] arr = new int[count];
        System.out.print("Please enter the elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt();
        }

        //selection sort，把最小的丟在最左邊，依序往右邊排
        int tmp=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){

                if (arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


        //Print
        for (int n:arr
        ) {
            System.out.print(n+"\t");
        }


        //selectionSort();
        //arrayListSortedMethod();
        //listSortedMethod();
        //listPrac();

    }

    private static void selectionSort() {
        int tmp=0;
        int[] arr = {30, 25, 35, 20};
//SelectionSort
        for(int i=0;i<arr.length;i++){
            for (int j=i+1 ; j<arr.length ; j++) {

                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int n:arr
        ) {
            System.out.print(n+"\t");
        }
    }

    private static void arrayListSortedMethod() {
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number in the list?");
        count = scanner.nextInt();
        ArrayList<Integer> arrL = new ArrayList<>();
        for (int i=0; i<count ; i++) {
            System.out.println("Please enter the element: ");
            arrL.add(scanner.nextInt());
        }
        Collections.sort(arrL);
        System.out.println(arrL);
    }

    private static void listSortedMethod() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number in the list?");
        count = scanner.nextInt();

        int[] arr = new int[count];
        for (int i=0; i<count; i++){
            System.out.println("Please enter the element: ");
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int n:arr
        ) {
            System.out.print(n+"\t");
        }
    }

    private static void listPrac() {
        //arrayList
        ArrayList<Integer> arrL1 = new ArrayList<>();
        arrL1.add(2);
        arrL1.add(1);
        arrL1.add(5);
        arrL1.add(4);
        arrL1.add(3);
        System.out.println(arrL1);
        Collections.sort(arrL1);
        System.out.println(arrL1);
        System.out.println(arrL1.get(0));

        //list
        int [] arr1 = new int[4];
        arr1[0]=3;
        arr1[1]=1;
        arr1[2]=2;
        arr1[3]=4;
        Arrays.sort(arr1);
        for (int n :arr1
        ) {
            System.out.print(n+"\t");
        }
        //
        int [] arr2 = {3,4,2,1};
        Arrays.sort(arr2);
        for (int n :arr2
        ) {
            System.out.print(n);
        }
    }


}
