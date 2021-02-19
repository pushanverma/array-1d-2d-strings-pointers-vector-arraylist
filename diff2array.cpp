#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
    int arr1[10][10];
    int arr2[10][10];
    int row, column;
    cout<<"\nenter row and column -";
    cin>>row>>column;
    cout<<"\nEnter elements for 1st array-";
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            cin>>arr1[r][c];
        }
    }

    cout<<"\nEnter elements for 2nd array-";
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            cin>>arr2[r][c];
        }
    }
int arr3[10][10];
    cout<<"\n diffrence  of two array -\n";
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            arr3[r][c]=arr2[r][c]-arr1[r][c];
            cout<<arr3[r][c]<<"\t";
        }
        cout<<endl;
    }

}