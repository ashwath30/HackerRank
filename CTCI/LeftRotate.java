import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
            a[(i+(n-d))% n]=in.nextInt();
        
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    //newLocation = (i + (lengthOfArray - shiftAmount)) % lengthOfArray;
    
}
    }
