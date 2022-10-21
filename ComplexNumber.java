//Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply 
//two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to 
//initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the 
//imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
//2i; (ii) to print the sum and product of those numbers. 

import java.util.*;
class Complex
{   int a1;
	int a2;
	int b1;
	int b2;

	Complex()
	{
	a1=0;
	a2=0;
	b1=0;
	b2=0;
	
	}
	Complex(int a1,int a2)
	{
	this.a1=a1;
	this.a2=a2;
	b1=0;
	b2=0;
	}
	Complex(int a1,int a2,int b1,int b2)
	{
	this.a1=a1;
	this.a2=a2;
	this.b1=b1;
	this.b2=b2;
	}
	void print()
	{
	if (b1 >=0)
	System.out.println("First complex number:"+a1+"+"+b1+"i");
	else
	System.out.println("First complex number:"+a1+b1+"i");
	if (b2 >=0)
	System.out.println("Second complex number:"+a2+"+"+b2+"i");
	else
	System.out.println("Second complex number:"+a2+b2+"i");
	}
	void operation()
	{
	int a3=a1+a2;
	int b3=b1+b2;
	int a4=a1*a2-b1*b2;
	int b4=a1*b2+b1*a2;
	if (b3 >=0)
	System.out.println("Addition of two complex number:"+a3+"+"+b3+"i");
    else 
	System.out.println("Addition of two complex number:"+a3+b3+"i");
	if (b4 >=0)
	System.out.println("Product of two complex number:"+a4+"+"+b4+"i");
	else
	System.out.println("Product of two complex number:"+a4+b4+"i");
		
	}
	
}
class ComplexNumber
{
	public static void main (String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter real part of first number ");
	int a1=sc.nextInt();
	System.out.println("Enter imaginary part of first number ");
	int b1=sc.nextInt();
	System.out.println("Enter real part of first number ");
	int a2=sc.nextInt();
	System.out.println("Enter imaginary part of first number ");
	int b2=sc.nextInt();
	Complex n = new Complex(a1,a2,b1,b2);
	n.print();
	n.operation();
	}
}