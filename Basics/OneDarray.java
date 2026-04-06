package Basics;
import java.util.Scanner;

public class OneDarray {
    public static void main(String[] args) {
        // create a rray of length 5 and print that
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = sc.nextInt();

        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = sc.nextInt();
        }

        // System.out.print("Print the array: ");
        // for(int i=0; i<n; i++){
        //     System.out.print(temp[i]+" ");
        // }

        // for each loop
        // for(int ele:temp){
        //     System.out.print(ele + " ");
        // }

        // Sum of all element array
        System.out.println("Sum of all element i array: ");
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += temp[i];
        }

    }
}
