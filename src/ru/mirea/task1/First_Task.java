package ru.mirea.task1;
import java.util.Scanner;
import java.util.Random;

public class First_Task {


    public static int recursion(int x){
        if(x <= 1){
            return x;
        }else{
            return x * recursion(x - 1);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr1 = new int[10], arr2 = new int[10], arr3 = new int[10];
        int random = 0, sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < 10; ++i){
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; ++i){
            sum1 += arr1[i];
        }
        while (sum2 != sum1){
            int i = 0;
            sum2 += arr1[i];
            i++;
        }
        do {
            int i = 0;
            sum3 += arr1[i];
        }while (sum3 != sum2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        for(int i = 0; i < 10; ++i){
            System.out.print( arr1[i] + " " );
        }
        System.out.println();

        for (int i = 1; i < 11; ++i){
            System.out.print( 1. / i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; ++i){
            arr2[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < 10; ++i){
            System.out.print( arr2[i] + " " );
        }
        System.out.println();
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < 10 - (i + 1); ++j){
                if ( arr2[j] > arr2[j + 1]){
                    int x = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = x;
                }
            }
        }
        for ( int i = 0; i < 10; ++i){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 10; ++i){
            random = r.nextInt(100) + 1;
            arr3[i] = random;
        }
        for(int i = 0; i < 10; ++i){
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < 10 - (i + 1); ++j){
                if ( arr3[j] > arr3[j + 1]){
                    int x = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = x;
                }
            }
        }
        for(int i = 0; i < 10; ++i){
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        System.out.print(recursion(sc.nextInt()));

    }
}
