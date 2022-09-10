import java.util.*;

class age  {

   public static void main(String args[])  {

       int age1,age2,age3,max,min;

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the age of First Person:  ");

       age1=sc.nextInt();

       System.out.print("Enter the age of Second Person:  ");

       age2=sc.nextInt();

       System.out.print("Enter the age of Third Person:   ");

       age3=sc.nextInt();

       if(age1>age2 && age1>age3)

           System.out.println("First Person is the Oldest.");

       else if(age2>age1 && age2>age3)

           System.out.println("Second Person is the Oldest.");

       else if(age3>age1 && age3>age2)

           System.out.println("Third Person is the Oldest.");

       else    {

           System.out.println("All have equal ages.");

           System.exit(0);

       }

       if(age1<age2 && age1<age3)

           System.out.println("First Person is the Youngest.");

       else if(age2<age1 && age2<age3)

           System.out.println("Second Person is the Youngest.");

       else if(age3<age1 && age3<age2)

           System.out.println("Third Person is the Youngest.");

       sc.close();

   }

}

