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
        int N = scanner.nextInt();
        if(N%2!=0)
        {
            System.out.println("Weird");

        }
       if (N%2==0&&N<=5&&N>=2)
        {
            System.out.println("Not Weird");
        }
        if(N%2==0&&N<=20&&N>=6)
        {
            System.out.println("Weird");
        }
        if(N%2==0&&N>20)
        {
            System.out.println("Not Weird");
        }
        
        scanner.close();
    }
}
