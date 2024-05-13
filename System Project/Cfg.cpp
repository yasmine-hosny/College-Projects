#include <bits/stdc++.h>
using namespace std;

int main()
{
    cin.tie(0)->sync_with_stdio(0);
    string s;
    char news[100];
    int x=0, n=0, A=0, aa=0, B=0, bb=0, Ab=0, aA=0, Ba=0, bB=0;
    cin>>s;
    n=s.length();

    for(int i=0; i<n; i+=2)
    {
        if(s[i] == 'a' && s[i+1] == 'b' && s[i+2] == 'b' && s[i+3] != 'b')
        {
            news[x]='A';
            news[++x]='b';
            i++;
        }
        else if(s[i] == 'a' && s[i+1] == 'a' && s[i+2] == 'b' && s[i+3] != 'b')
        {
            news[x]='a';
            news[++x]='A';
            i++;
        }
        else if(s[i] == 'b' && s[i+1] == 'a' && s[i+2] == 'a' && s[i+3] != 'a')
        {
            news[x]='B';
            news[++x]='a';
            i++;
        }
        else if(s[i] == 'b' && s[i+1] == 'b' && s[i+2] == 'a' && s[i+3] != 'a')
        {
            news[x]='b';
            news[++x]='B';
            i++;
        }
        else if(s[i]=='a' && s[i+1] == 'b')
        {
            news[x]='A';
            news[++x]='A';
        }
        else if( s[i-1] != 'a' && s[i]=='a' && s[i+1] == 'a' && s[i+2] != 'a')
        {
            news[x]='a';
            news[++x]='a';
        }
        else if(s[i-1] != 'b' && s[i]=='b' && s[i+1] == 'b' && s[i+2] != 'ba')
        {
            news[x]='b';
            news[++x]='b';
        }
        else if(s[i]=='b' && s[i+1] == 'a')
        {
            news[x]='B';
            news[++x]='B';
        }
        x++;
    }

    // count

    for(int i=0; i<x; i+=2)
    {
        if(news[i]=='A' && news[i+1]=='b')
            Ab+=1;
        else if(news[i]=='a' && news[i+1]=='A')
            aA+=1;
        else if(news[i]=='B' && news[i+1]=='a')
            Ba+=1;
        else if(news[i]=='b' && news[i+1]=='B')
            bB+=1;
        else if(news[i]=='A' && news[i+1]=='A')
            A+=1;
        else if(news[i]=='B' && news[i+1]=='B')
            B+=1;
        else if(news[i]=='a' && news[i+1]=='a')
            aa+=1;
        else if(news[i]=='b' && news[i+1]=='b')
            bb+=1;
    }


    if(Ab == 1 && A >= 0 && B == 0 && aa == 0 && bb == 0 && aA == 0 && Ba == 0 && bB == 0)
        cout<<"Accept"<<endl;
    else if(Ab == 0 && A >= 0 && B == 0 && aa == 0 && bb == 0 && aA == 1 && Ba == 0 && bB == 0)
        cout<<"Accept"<<endl;
    else if(Ab == 0 && A >= 0 && B >= 0 && aa == 0 && bb == 0 && aA == 0 && Ba == 1 && bB == 0)
        cout<<"Accept"<<endl;
    else if(Ab == 0 && A >= 0 && B >= 0 && aa == 0 && bb == 0 && aA == 0 && Ba == 0 && bB == 1)
        cout<<"Accept"<<endl;
    else if(Ab == 0 && A >= 0 && B >= 0 && aa == 0 && bb == 1 && aA == 0 && Ba == 0 && bB == 0)
        cout<<"Accept"<<endl;
    else if(Ab == 0 && A >= 0 && B >= 0 && aa == 1 && bb == 0 && aA == 0 && Ba == 0 && bB == 0)
        cout<<"Accept"<<endl;
    else
        cout<<"Reject"<<endl;
}
