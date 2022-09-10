import java.lang.*;
import java.util.Scanner;
public class squareornot{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int breath=sc.nextInt();
		if(length==breath)
			{
				System.out.println("Square");
			}
		else{
				System.out.println("not a square");
			}
}
}
		