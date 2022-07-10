#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str,s;
    cin>>str;
    cin>>s;
    int len = s.length();
    int ptr = 0;
    for(int i=0;i<len;i++){
        if(s[i] == 'R'){
            ptr++;
        }
        if(s[i] == 'L'){
            ptr=ptr-1;
        }
        if(s[i] == 'T'){
            if (str[i]=='9'){
                str[ptr+1]='9';
            }
            else{            
            str[ptr] = str[ptr] + 1; 
            }
        }
        if(s[i] == 'D'){
            if(str[i]=='0'){
                str[ptr]='0';
            }
            else{
            str[ptr] = str[ptr] - 1;
            }
        }
        if(s[i] == 'S'){
            char ch = s[i+1];
            int num = ch - '0';
            char temp = str[num-1];
            str[num-1] = str[ptr];
            str[ptr] =  temp;
        }
    }
  cout<<str<<endl;
  return 0;
}