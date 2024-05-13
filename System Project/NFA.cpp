#include <bits/stdc++.h>
using namespace std;

int transition(int state, char ch, string s, char ch2)
{
    if(s[0] == 'a' && s[2] == 'a' || s[0] == 'b' && s[2] == 'a' || s[0] == 'a' && s[1] == 'a')
    {
        if(state == 1)
        {
            if(ch == 'a' && ch2 == 'a')
                return 4;
            else if(ch == 'a' && ch2 == 'b')
                return 2;
            else if(ch == 'b' && ch2 == 'a')
                return 3;
        }
        else if(state == 2 && ch == 'b')
            return 3;
        else if(state == 3)
        {
            if(ch == 'a' && ch2 == 'a')
                return 4;
            else
                return 1;
        }
        else if(state == 4 && ch == 'a')
            return 5;
        else if(state == 5 && ch == 'b')
            return 6;
        else if(state == 6 && ch == 'a')
            return 5;
        else
            return 0;
    }
    else
    {
        if(state == 1)
        {
            if(ch == 'b' && ch2 == 'b')
                return 4;
            else if(ch == 'b' && ch2 == 'a')
                return 2;
            else if(ch == 'a' && ch2 == 'b')
                return 3;
        }
        else if(state == 2 && ch == 'a')
            return 3;
        else if(state == 3)
        {
            if(ch == 'b' && ch2 == 'b')
                return 4;
            else
                return 1;
        }
        else if(state == 4 && ch == 'b')
            return 6;
        else if(state == 6 && ch == 'a')
            return 5;
        else if(state == 5 && ch == 'b')
            return 6;
        else
            return 0;
    }
}


int accept(int state)
{
    if(state == 5 || state == 6)
        return 1;
    else
        return 0;
}

int main()
{
    string s;
    int state=1;
    cin>>s;
    for(int i = 1; i<=s.length(); i++)
    {
        int newstate = transition(state, s[i-1], s, s[i]);
        state = newstate;
    }
    if(accept(state))
        cout<<"Accept"<<endl;
    else
        cout<<"Reject"<<endl;
}
