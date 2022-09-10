import java.util.Scanner;
public class userdiscount{
	public static void main(String[] args){
		int discount ;
		System.out.println("Enter the units for purchasing"); 
		Scanner sc=new Scanner(System.in);
		int unit=sc.nextInt();
		unit=unit*100;
		if(unit>1000)
		{
			discount=(10*unit)/100;
			unit=unit-discount;
			System.out.println("discount amount is "+discount);
			System.out.println("amount after discount"+unit);
		}
		else
		{
			System.out.println("no discount below 1000,your amount is"+unit);
		}
	}
}