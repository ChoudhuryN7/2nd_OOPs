abstract class Employee
{
	private int empId;
	private String empName;

	abstract double getSalary();

	Employee()
	{
		
	}
	
	void setDetails(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	int getDetails()
	{
		return empId; 
	}
	String getDetails1()
	{
		return empName;
	}
	
}
class RegularEmployee extends Employee
{
	private double basicPay;
	
	RegularEmployee()
	{
		
	}
	RegularEmployee(int empId , String empName , double basicPay)
	{
		setDetails(empId,empName);
		this.basicPay = basicPay;
		getSalary();
		
	}
	double getSalary()
	{
		double salary = (basicPay * 1.7);
		return salary;
	}
	public void printDetails()
	{
		System.out.println(getDetails()+"	"+getDetails1()+"		"+getSalary());
	}

}
abstract class ContractBased extends Employee
{
	private int noOfYears;
	
	void setNoOfYears(int noOfYears)
	{
		this.noOfYears=noOfYears;
	}
		
	public int getNoOfYears()
	{
		return noOfYears;
	}
}
class CDACcbEmployee extends ContractBased
{
	double consolidatedSalary;
	
	CDACcbEmployee()
	{
		
	}
	CDACcbEmployee(int empId , String empName , int noOfYears,double consolidatedSalary)
	{
		setDetails(empId,empName);
		this.consolidatedSalary=consolidatedSalary;
		getSalary();
		setNoOfYears(noOfYears);
		//getNoOfYears();
		
	}
	double getSalary()
	{
		double salary=consolidatedSalary;
		return salary;
	}
	/*int getNoOfYears()
	{
		
		return noOfYears;
	}*/
	public void printDetails()
	{
		System.out.println(getDetails()+"	"+getDetails1()+"	"+getNoOfYears()+"	"+getSalary());
	}
}

class ThirdPartyEmployee extends ContractBased
{
	double consolidatedSalary;
	
	ThirdPartyEmployee()
	{
		
	}
	ThirdPartyEmployee(String empName , int noOfYears,double consolidatedSalary)
	{
		setDetails(0,empName);
		this.consolidatedSalary=consolidatedSalary;
		getSalary();
		setNoOfYears(noOfYears);
		//this.noOfYears=noOfYears;
	}
	double getSalary()
	{
		double salary=consolidatedSalary;
		return salary;
	}
	/*int getNoOfYears()
	{
		
		return noOfYears;
	}*/
	public void printDetails()
	{
		System.out.println("00"+"	"+getDetails1()+"	"+getNoOfYears()+"	"+getSalary());
	}
}
class EmployeeDetails
{
	public static void main(String args[])
	{	
		RegularEmployee remp = new RegularEmployee(1,"Ram",50000);
		remp.printDetails();
		CDACcbEmployee cbemp = new CDACcbEmployee(2,"Mohit",3,55000);
		cbemp.printDetails();
		ThirdPartyEmployee tpemp = new ThirdPartyEmployee("Rajesh",2,30000);
		tpemp.printDetails();
	}
}