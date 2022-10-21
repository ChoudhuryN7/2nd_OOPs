import java.util.Scanner;
class Room{
double room_height;
double room_width;
double room_breadth;
double volume;


	Room()                                       //default constructor
	{
		System.out.println("Proper data is not entered");
		room_breadth=0.0;
		room_height=0.0;
		room_width=0.0;
	}
	Room(double h,double b,double w)
	{
	this.room_height=h;
	this.room_breadth=b;
	this.room_width=w;

	
	}
	void volume()
	{
	double volume1=room_height*room_breadth*room_width;
	volume=volume1;
	
	}
	void print()
	{
	System.out.println(volume);
	}
}
class RoomVolume{
public static void main(String []args){

	System.out.println("enter number of rooms");
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	Room rom[]=new Room[num];
	System.out.println("Enter the dimensions of room height,bradth and width ");
	for(int i=0;i<num;i++)
	{
	double h= sc.nextDouble();
	double w= sc.nextDouble();
	double b= sc.nextDouble();
	rom [i]= new Room(h,w,b);
	
	}
	
	for(int i=0;i<num;i++)
	{
	rom[i].volume();
	}
	
	
	for(int i=0;i<num;i++)
	{
		int temp = i+1;
	System.out.println("Volume  of room no  "+temp+" is:");
	rom[i].print();
	}
}
	
	
} 
	