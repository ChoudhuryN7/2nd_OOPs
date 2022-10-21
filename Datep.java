import java.util.Scanner;
class DateDemo
{
	int d;
	int m;
	int y;
	
	DateDemo()
	{
		d=01;
		m=01;
		y=1970;
	}
	DateDemo(int d)
	{
	this.d=d;
	m=01;
	y=1970;
	}
	DateDemo(int d,int m)
	{
	this.d=d;
	this.m=m;
	y=1970;
	}
	DateDemo(int d,int m,int y)
	{
	this.d=d;
	this.m=m;
	this.y=y;
	}
	void print()
	{
	System.out.println(d+"-"+m+"-"+y);
	
	}

void getnext()
	{
		if ((m==1||m==3||m==5||m==7||m==8||m==10)&&(d==31))
{   
	m++;
	d=1;
}
else if ((m==12) && (d==31))
{
	m=1;
	d=1;
	y++;
}
else if ((m==4||m==6||m==9||m==11)&&(d==30))
	{
	m++;
	d=1;
}

else if (( m == 2 ) &&( d == 29 && ( y % 400 == 0 || ( y % 4 == 0 && y % 100 != 0 ))))
	{
	m++;
	d=1;
	}
else if (( m == 2 ) &&(  ( y % 400 == 0 || ( y % 4 == 0 && y % 100 != 0 )) && (d == 28 )))
	{
	
	d++;
	}
else if (( m == 2 ) &&((d==28 && ( y % 400 != 0 || ( y % 4 !=0 && y % 100 != 0 )))))
	{ 
     m++;
	d=1;
	}
	

else
	d++;
	
	System.out.println(d+"-"+m+"-"+y);
	
	}
	void getprevious()
	{
		if ((m==12||m==5||m==7||m==10)&&(d==1))
{   
	m--;
	d=30;
}
else if ((m==1) && (d==1))
{
	m=12;
	d=31;
	y--;
}
else if ((m==4||m==6||m==9||m==11||m==2||m==8)&&(d==1))
	{
	m--;
	d=31;
}

else if (( m == 3 ) &&( (d == 1 )&& ( y % 400 == 0 || ( y % 4 == 0 && y % 100 != 0 ))))
	{
	m--;
	d=29;
	}
else if (( m == 3 ) &&((d==1 )&& ( y % 400 != 0 || ( y % 4 !=0 && y % 100 != 0 ))))
	{ 
     m--;
	d=28;
	}
	

else
	d--;
	
	System.out.println(d+"-"+m+"-"+y);
	

}

		
	}
	

class Datep
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
	int m=sc.nextInt();
	int y=sc.nextInt();
	DateDemo d1=new DateDemo(d,m,y);
	DateDemo d2=new DateDemo(d,m,y);
	System.out.println("Current Date");
	d1.print();
	System.out.println("Next Date");
	d1.getnext();
	System.out.println("previous Date");
	d2.getprevious();
	
	
	}
}