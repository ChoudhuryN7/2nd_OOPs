abstract class Employee
{
int id;
String name;

abstract void getSalary();

abstract void printSalary();
abstract printDetails();
{
	
}

}

class Remp extends Employee
{
int basicpay;
double sal;
Remp(String name,int id,int basicpay)
{
	this.name=name;
	this.id=id;
	this.basicpay=basicpay;
}
void getSalary()
{
 double sal=basicpay*1.7;
 
 this.sal=sal;
}
void printSalary()
{
	System.out.println(sal);
}
void printDetails()
{
	System.out.println(name);
	System.out.println(id);
	System.out.println(basicpay);
}

}

abstract class ContractEmp extends Employee
{
abstract int NoOfYears;
abstract void getSalary();
abstract void printSalary();
abstract printDetails();

}

class CdacCbEmp extends ContractEmp
{
int intNoOfYears;
int basicpay;
CdacCbEmp(String name,int id,int basicpay)
{
	this.name=name;
	this.id=id;
	this.basicpay;
	double sal;
}
int consolidatedpay=(basicpay/2)*No.ofYears;
double getSalary()
{
	this.sal=basicpay;
	
}

}
void printSalary()
{
	System.out.println(sal);
	System.out.println(consolidatedpay);
}
void printDetails()
{
	System.out.println(name);
	System.out.println(id);
	System.out.println(basicpay);
}

class ThirdCbEmp extends ContractEmp
{
int intNoOfYears;

void getSalary()
{
 
}

}
void printSalary()
{}
}
void printDetails()
{
	System.out.println(name);
	System.out.println(id);
	System.out.println(basicpay);
}
class CdacEmp{
public static void main(String args[])
{
Remp ob1=new Remp("Roy",01,5000);
ob1.printDetails();
ob1.getSalary();
ob1.printSalary();
}
}