import java.util.Scanner;
class Primesornot
{
  public static boolean isPrime(int n)
  {
     int count=0;
	 for(int i=2;i<=(int)Math.sqrt(n);i++)
	 {
	    if(n%i==0)
		  count++;
	 }
	 if(count==0)
	    return true;
	 else
	    return false;
  }
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n;
	 n=sc.nextInt();
	 if(isPrime(n))
	   System.out.println("True");
	 else
	   System.out.println("False");
	 
	 sc.close();
		    
  }
}