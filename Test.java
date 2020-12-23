import java.util.Scanner;

class Test{

	public static void main(String arg[])
	{
	int total=500;
	int per;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first subject marks");
	int a=sc.nextInt();
	System.out.println("Enter second subject marks");
	int b=sc.nextInt();
	System.out.println("Enter third subject marks");
	int c=sc.nextInt();
	System.out.println("Enter fourth subject marks");
	int d=sc.nextInt();
	System.out.println("Enter fifth subject marks");
	int e=sc.nextInt();
	per=(a+b+c+d+e)*100;	
	System.out.println(per);
	}




}