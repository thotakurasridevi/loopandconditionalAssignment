import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r;
		r=sc.nextInt();
		for(int i=1;i<=2*r-1;i++)			
		{   int k=i>r?r-i%r:i;
			for(int j=1;j<=k;j++)		 
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
}
