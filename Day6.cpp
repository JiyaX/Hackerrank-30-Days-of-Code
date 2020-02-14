#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<cstring>
using namespace std;


int main() {
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        string s;
        cin>>s;
        int m=s.length();
        for(int j=0;j<m;j++)
        {
            if(j%2==0)
            {
                cout<<s[j];
                }
            
        }
        cout<<" ";
         for(int j=0;j<m;j++)
        {
            if(j%2!=0)
            {
                cout<<s[j];
                }    
          }
          cout<<endl;
          }/* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
