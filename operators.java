//largest elements in an array;
//factorial
//highest salary and print name






import java.util.*;
class Employee{

String name;
double salary;
Employee(String name,double salary){
this.name=name;
this.salary=salary;
}
}
class operators{
public static void main(String args[]){

Employee e1=new Employee("anil",1223121);
Employee e2=new Employee("divya",1223113134);
Employee e3=new Employee("tanu",1223113345);
Employee e4=new Employee("jyotsana",1223113454);
Employee e5=new Employee("varti",1223113987);
Employee e6=new Employee("sam",122311334);
Employee e7=new Employee("pawan",122311398);
Employee e8=new Employee("ayu",1223113489);
Employee e9=new Employee("shashank",1223112364);
Employee e10=new Employee("alok",122311678);
Employee[] arr=new Employee[10];
arr[0]=e1;
arr[1]=e2;
arr[2]=e3;
arr[3]=e4;
arr[4]=e5;
arr[5]=e6;
arr[6]=e7;
arr[7]=e8;
arr[8]=e9;
arr[9]=e10;


double ans=0;
int i=0;
String name="";
while(i<arr.length){
if(arr[i].salary>ans){
	ans=arr[i].salary;
	
	name=arr[i].name;
}
i++;
}
System.out.println(name+"has maximum salaryof"+ans);
}
}
