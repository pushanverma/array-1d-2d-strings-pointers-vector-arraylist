#include<iostream>

using namespace std;

int main(int argc, char** argv)
{

    int row;
    cout<<"\nenter row=";
    cin>>row;

    int arr[row];
    cout<<"\nenter elements->\n";
    for(int i=0;i<row;i++)
    {
        cin>>arr[i];
        cout<<endl;
    }
    cout<<"\n displaying no.s ->\n";
    for(int i=0;i<row;i++)
    {
        cout<<arr[i]<<"\n";
    }
}