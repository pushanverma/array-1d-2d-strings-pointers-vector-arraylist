#include<iostream>

using namespace std;

int main(int argc, char** argv)
{

    int arr[10][10];
    int row, column;
    int sum=0;
    cout<<"\nenter row & column -\n";
    cin>>row>>column;
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            cin>>arr[r][c];
        }
    }
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<column;c++)
        {
            if(r==c)
            {
                sum+=arr[r][c];
            }
        }
    }

cout<<"\n Sum of leading diagonal -"<<sum;


}