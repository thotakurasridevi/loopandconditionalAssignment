import java.util.Scanner;
class evenornot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
		    System.out.println("Odd Number");
		}
		sc.close();
	}
}

