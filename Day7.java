import java.io.*;

import java.util.*;


public class Solution {



   
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
          for(int j=n-1;j>=0;j--)
            {
              int bb[] = new int[n];
              bb[i] = arr[j];
              System.out.print(bb[i]+" ");
            }
            break;
        
        

        }
        
        }
        
}
        

       
