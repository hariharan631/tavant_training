package day1;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 int sumOfEvenNumbers(int start, int end)
 { 
	int sum1=0;
	for(int i=2;i<=10;i++)
	{
		while (i%2==0)
		{
		 sum1=sum1+i;
		}
	}
	return sum1; 
 }
 int sumOfOddNumbers(int start, int end)
 { 
	int sum2=0;
	for(int j=1;j<=10;j++)
	{
		while (j%2!=0)
		{
		 sum2=sum2+j;
		}
	}
	return sum2; 
 }
}
