import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       {
            Scanner scan= new Scanner(System.in);
            int t= scan.nextInt();
            for(int i=0;i<=t;i++)
            {
 String s= scan.nextLine();
               
                
                if(s.isEmpty())
                {}
                else{


                char []n= s.toCharArray();
                int k= n.length;
                
                for(int j=0;j<k;j++)
                {
                    if(j%2==0)
                    {
                        System.out.print(n[j]);
                    }
                }

               
                System.out.print(" ");

                for(int m=0;m<k;m++)
                {
                    if(m%2==1)
                    {
                        System.out.print(n[m]);
                    }
                    
                }
               
               System.out.println();
            
                
            
            }}
             
           
        }
    }}
