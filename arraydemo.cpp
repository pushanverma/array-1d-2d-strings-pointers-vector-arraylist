#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
    int arr[5];
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
        cout<<endl;
    }
    cout<<"\n displaying the array ->";
    for(int i=0;i<5;i++)
    {
        cout<<"\n"<<arr[i];
    }
}