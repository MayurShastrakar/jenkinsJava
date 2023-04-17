package BinarySearch;

import java.util.Scanner;

public class findMIN {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("enter 10 numbers");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }

    static int findMin(int[] arr){

        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]<=min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findMax(int[] arr){
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
}
