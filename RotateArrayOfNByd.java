/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void leftRotate(int arr[], int d) 
    { 
        if (d == 0) 
            return; 
        int n = arr.length; 
        rvereseArray(arr, 0, d - 1); 
        rvereseArray(arr, d, n - 1); 
        rvereseArray(arr, 0, n - 1); 
    } 
  
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        while (start < end) { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 
    
    static void printArray(int arr[]) { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    } 
    
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
         // values in each TestCase 
        for (int i = 0; i < T; i++) { 
            String s = scanner.nextLine();
            String[] str = s.split(" ");
            int n = Integer.parseInt(str[0]); 
            int d = Integer.parseInt(str[1]); 
            int arrayMain[] = new int[n]; 
            String[] nums = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) { 
                arrayMain[j] = Integer.parseInt(nums[j]); 
            }
            leftRotate(arrayMain, d);
            printArray(arrayMain);
        }
        scanner.close();
	}
}
