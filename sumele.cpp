#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
    int arr[10][10];
    int row, column;
    cout<<"\nenter row and column -";
    cin>>row>>column;
    cout<<"\nEnter elements -";
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            cin>>arr[r][c];
        }
    }
// sum of all elements present in the matrix
int sum =0;
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
             sum +=arr[r][c];
        }
    }
cout<<"\n Sum of all elements -"<<sum;
}
