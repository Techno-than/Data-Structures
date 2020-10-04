/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String reverse(String str) {
        char[] arr = new char[str.length()];
        for(int j = 0; j < str.length(); j++){
            arr[j] = str.charAt(j);
        }
        char temp;
        int k =0;
        int n = str.length() - 1;
        while(k < n){
            temp = arr[k];
            arr[k] = arr[n];
            arr[n] = temp;
            k++;
            n--;
        }
        return String.valueOf(arr);
    }
    
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    int n = scanner.nextInt();
	    scanner.nextLine();
	    for(int i=0; i <n ; i++) {
	        String str = scanner.nextLine();
	        System.out.println(reverse(str));
	    }
	}
}
