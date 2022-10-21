import java.util.Scanner;
class Box 
{
int height;
int width;
int breadth;

int getVolume()
{
return 		height* width *	breadth;
}
int getArea()
{
return 2*(height*width+height*breadth+breadth*width);
}

}
class BoxParameter{
	public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter details of Box1");
		System.out.println("Height");
		int h =sc.nextInt();
		System.out.println("Width");
		int w=sc.nextInt();
		System.out.println("Breadth");
		int b=sc.nextInt();
		Box b1=new Box();
		b1.height=h;
		b1.width=w;
		b1.breadth=b;
		System.out.println(" Volume of Box1 :"+b1.getVolume()+"\n Surface area of Box1 :"+b1.getArea());
		
		System.out.println("Enter details of Box2");
		System.out.println("Height");
		h =sc.nextInt();
		System.out.println("Width");
		w=sc.nextInt();
		System.out.println("Breadth");
		b=sc.nextInt();
		Box b2=new Box();
		b2.height=h;
		b2.width=w;
		b2.breadth=b;
		System.out.println(" Volume of Box2 :"+b2.getVolume()+"\n Surface area of Box2 :"+b2.getArea());
		
}
}
