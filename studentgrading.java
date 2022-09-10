import java.util.Scanner;
public class studentgrading{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your grades");
		int grades=sc.nextInt();
		if(grades<25)
		{
			System.out.println("your grades is f");
		}
		else if(grades>25&&grades<45)
		{
			System.out.println("your grades is E");
		}	
		else if(grades>45&&grades <50)
		{
			System.out.println("your grades is D");
		}
		else if(grades>50&&grades<60)
		{
			System.out.println("Your grades is C");
		}	
		else if(grades>60&&grades<80)
		{
			System.out.println("Your grades is B");
		}
		else
		{
			System.out.println("Your grades is A");
		}
	}
}