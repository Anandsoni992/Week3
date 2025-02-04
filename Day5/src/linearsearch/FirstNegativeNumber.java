package linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int flag = 0 ;
        System.out.println("Enter array elements: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<size; i++){
            if(arr[i]<0){
                System.out.print(i);
                flag = 1 ;
                break;
            }
        }
        if(flag ==0 ){
            System.out.print(-1);
        }

    }
}
