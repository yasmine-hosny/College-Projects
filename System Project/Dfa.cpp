#include <bits/stdc++.h>
using namespace std;

int transition(int state, char ch) {
    if(state == 1 && ch == 'a')
        return 2;
    else if(state == 1 && ch == 'b')
        return 9;
    else if(state == 2 && ch == 'a')
        return 5;
    else if(state == 2 && ch == 'b')
        return 3;
    else if(state == 3 && ch=='a')
        return 4;
    else if(state == 3 && ch=='b')
        return 12;
    else if(state == 4 && ch == 'a')
        return 5;
    else if(state == 4 && ch == 'b')
        return 8;
    else if(state == 5 && ch == 'b')
        return 6;
    else if(state == 5 && ch == 'a')
        return 0;
    else if(state == 6 && ch == 'a')
        return 7;
    else if(state == 6 && ch == 'b')
        return 0;
    else if(state == 7 && ch== 'a')
        return 0;
    else if(state == 7 && ch == 'b')
        return 6;
    else if(state == 8 && ch == 'a')
        return 2;
    else if(state == 8 && ch == 'b')
        return 12;
    else if(state == 9 && ch == 'a')
        return 10;
    else if(state == 9 && ch == 'b')
        return 12;
    else if(state == 10 && ch == 'a')
        return 5;
    else if(state == 10 && ch == 'b')
        return 11;
    else if(state == 11 && ch == 'a')
        return 15;
    else if(state == 11 && ch == 'b')
        return 12;
    else if(state == 12 && ch == 'a')
        return 13;
    else if(state == 12 && ch == 'b')
        return 0;
    else if(state == 13 && ch== 'a')
        return 0;
    else if(state == 13 && ch == 'b')
        return 14;
    else if(state == 14 && ch == 'a')
            return 13;
    else if(state == 14 && ch == 'b')
        return 0;
    else if(state == 15 && ch=='a')
        return 12;
    else if(state == 15 && ch == 'b')
        return 9;
}

int accept(int state)
{
    if(state == 5 || state == 6 || state == 7 || state == 12 || state == 13 || state == 14)
        return 1;
    else
        return 0;
}

int main()
{
    cin.tie(0)->sync_with_stdio(0);
    string s;
    int state=1;
    cin>>s;
    for(int i=0; i<s.size(); i++)
    {
        int newstate = transition(state, s[i]);
        state = newstate;
    }
    if(accept(state))
        cout<<"Accept"<<endl;
    else
        cout<<"Reject"<<endl;
}
