
import java.util.Scanner;

class Student
{
	String name;
	int m1;
	int m2;
	int m3;
	int total;
	double avg;
	 
	
	Student()
	{
	name=null;
	m1=0;
	m2=0;
	m3=0;
	}
	 Student(String name,int m1,int m2,int m3)
	{
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	
	}
	void gettotal()
	{
	total=m1+m2+m3;
	avg=total/3;
	}
	void print ()
	{
	System.out.println("Name of Student : "+name+"\nTotal marks:  "+total+" \nAvarage marks: "+avg);
	}
	
}

class StudentData
{
	public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String name=sc.next();
	int m1=	sc.nextInt();
	int m2=	sc.nextInt();
	int m3=	sc.nextInt();
	
	Student s = new Student(name,m1,m2,m3);
	s.gettotal();
	s.print();
	

}
}