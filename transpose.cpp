#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
    int arr[10][10];
    int row,column;
    cout<<"\nEnter row & column -\n";
    cin>>row>>column;
    cout<<"\nenter elements ->";
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            cin>>arr[r][c];
        }
    }
    cout<<"\nTRANSPOSE OF MATRIX IS -\n";
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            cout<<arr[c][r]<<"\t";
        }
        cout<<endl;
    }
}