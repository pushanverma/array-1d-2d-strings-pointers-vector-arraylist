#include<iostream>

using namespace std;

int main(int argc, char** argv )
{
    int a,b;
    char p;
    cout<<"\nENter two nos.\n";
    cin>>a>>b;
    do
    {
    cout<<"Enter choice\n1.ADD\n2.SUBTRACT\n3.MULTIPICATION\n4.DIVISION\n";    
    int c;
    cout<<"\nEnter choice=";
    cin>>c;
    
        switch(c)
        {
        case 1: cout<<a+b;
        break;

        case 2:cout<<a-b;
        break;

        case 3:cout<<a*b;
        break;

        case 4:cout<<a/b;
        break;

        defalut: cout<<"\nINVALID CHOICE";
        }    
    cout<<"\n DO u WANNA CONTINUE?(Y/N):";
    cin>>p;
    } 
    while (p!='N');    
   
}