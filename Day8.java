//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m1=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            m1.put(name,phone);
            
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(m1.containsKey(s))
                {
                System.out.println(s+ "=" + m1.get(s));
            }
            else
                {
                System.out.println("Not found");
            }
        }
        in.close();
            // Write code here
    
    }
}
