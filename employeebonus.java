import java.util.Scanner;
public class employeebonus{
	public static void main(String[] args){
		System.out.println("Enter your salary");
		System.out.println("Enter your service of year");
		int bonus;
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		int year=sc.nextInt();
		if(year>5)
		{
			bonus=(salary*5)/100;
			salary=salary+bonus;
			System.out.println("salary after bonus"+salary);
		}
		else
		{
			System.out.println("Sorry!your year of service is less than 5 year");
		}
	}
}		