//.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
//parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
//returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
//product. power() method that takes two integer numbers as parameter and returns the power of first number to 
//second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
//methods of MathOperation class by providing entered numbers and prints the return values of every method.

import java.util.*;
class MathOperation
{
	public static int x;
	public static int y;
	
	MathOperation()
	{
		x=0;
		y=0;
	}
	MathOperation(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	static int add()
	{
	return x+y;
	}
	static int subtract()
	{
	return  x-y;
	}
	static int power()
	{
	return  (int)(Math.pow(x,y));
	}
	static int multiply()
	{
	return x*y;
	}


}
class Demo1
{
	public static void main(String []args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter operands");
	int x=sc.nextInt();
	int y=sc.nextInt();
	MathOperation m=new MathOperation(x,y);
	System.out.println("Enter choice of operation:");
	System.out.println("1=add  \n 2=subtract  \n 3=power  \n4=multiply");
	int s=sc.nextInt();
	switch(s)
	{
	case 1:
			MathOperation.add( );
			
			System.out.println("Result of addition:"+MathOperation.add());
			break;
	case 2:
			MathOperation.subtract( );
			System.out.println("Result of substract:"+MathOperation.subtract());
			break;
	case 3:
			MathOperation.power( );
			System.out.println("Result of power:"+MathOperation.power());
			break;
	case 4:
			MathOperation.multiply( );
			System.out.println("Result of addition:"+MathOperation.multiply());
			break;
	default:
			System.out.println("Wrong input choice");
			
	
	}
	
	
	
	
	}
}