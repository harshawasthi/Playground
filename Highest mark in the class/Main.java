#include<iostream>
using namespace std;
int main()
{
  int i,n,l,a[10];
    cin>>n;
  for(i=0;i<n;i++)
    cin>>a[i];
  l=a[0];
           for(i=0;i<n;i++)
           {
             if(l<a[i])
             {
             l=a[i]; 
           }
           }
  cout<<l;
  return 0;
    
}