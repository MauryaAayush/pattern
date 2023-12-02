#include<iostream>

using namespace std;

main ()
{
	
	for(int i = 1; i <= 5; i++)
	{
		for(int j = i; j <= 5; j++)
		{
			cout << " ";
		}
		cout << "*";
		
		for (int k = 1; k < (i - 1) * 2; k++)
		{
			cout << " ";
		}
		if(i == 1)
		{
			cout << endl;
		}
		else
		{
			cout << "*" << endl;
		}
		
		
//		cout << endl;
	}
	
	
	for(int i = 5; i >= 1; i--)
	{
		for(int j = i; j <= 5 ; j++)
		{
			cout << " ";	
		}
		cout << "*";
		for(int k = 1; k < (i-1) *2 ; k++)
		{
			cout << " ";
		}
		if(i==1)
		{
			cout << " " << endl;
		}
		else
		{
			cout << "*" << endl;
		}
//		cout << endl;
	}
}