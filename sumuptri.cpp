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
    int sum=0;
    
    for(int r=0;r<row;r++)
    {
        for(int c=r;c<column;c++)
        {
            sum+=arr[r][c];
        }
    }
    cout<<"\nSUM OF UPPER TRIANGLE ELEMENTS -\n"<<sum;
}