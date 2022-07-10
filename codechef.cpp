#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    while (t--)
    {
        int n,max;
        cin>>n>>max;
        int arr[100000];
        for (int i = 0; i < n; i++)
        {
            cin>>arr[i];
        }
        // int mini=n+1;
            int minLength=__INT_MAX__;
            int sum=0;
            int start=0;
        for (int i = 0; i < n; i++)
        {
            sum=sum+arr[i];
            while (sum>=max && start<=i)
            {
                minLength=min(minLength, (i-start)+1);
                sum=sum-arr[start++];
            }                 
            }
        if (minLength==__INT_MAX__)
        {
            cout<<-1<<endl;
        }
        else{
            cout<<minLength<<endl;
        }
        
        
        
    }
    return 0;
}