#include<iostream>
using namespace std;
int main()
{
  int i,n,l,a[10],p=0;
    cin>>n;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>l;

           for(i=0;i<n;i++)
           {
             if(a[i]==l)
             {
               ++p;
             }  
           }
             if(p==0)
               cout<<"She failed";
  else
    cout<<"She passed her exam";
           
  
  return 0;
    
}