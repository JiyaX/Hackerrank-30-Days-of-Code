import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        
        int max=0;
        int sum=0;
        for(int m=0;m<4;m++)
        {
            for(int n=0;n<4;n++)
            {
                sum=arr[m][n]+arr[m][n+1]+arr[m][n+2]+arr[m+1][n+1]+arr[m+2][n]+arr[m+2][n+1]+arr[m+2][n+2];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }}


    

