
 class Publication
 {
	public int noOfPages;
	public  int price;
	public String publisherName;
	
	void setDetails(int noOfPages,int price,String publisherName)
	{
	this.noOfPages =noOfPages;
	this.price = price;
	this.publisherName = publisherName;
    }
	void print()
	{
	System.out.println("Number of pages: "+noOfPages);
	System.out.println(" Price : "+price);
	System.out.println("Publication name"+publisherName);
	
	}
 
 } 
 class Book extends Publication
 {
     public String name;
    void setDetails(int noOfPages,int price,String publisherName,String name)
	{
	super.setDetails(noOfPages,price,publisherName);
	this.name =name;
    }
	void print()
	{
	super.print();
	System.out.println("Name of Book: "+name);
	}
 }
 class Journal extends Publication
 {
     public String name;
    void setDetails(int noOfPages,int price,String publisherName,String name)
	{
	super.setDetails(noOfPages,price,publisherName);
	this.name =name;
    }
	void print()
	{
	super.print();
	System.out.println("Name of Journal: "+name);
	}
 }
	
class Library
{
	public static void main(String []args)
	{
	Book b1=new Book();
	b1.setDetails(100,50,"Tata","Java");
	System.out.println("Details of First Book");
	b1.print();
	
	Book b2=new Book();
	b2.setDetails(120,150,"Nirali","os");
	System.out.println("Details of Second Book");
	b2.print();
	
	Book b3=new Book();
	b3.setDetails(200,1050,"Dhanpatrai","maths");
	System.out.println("Details of Third Book");
	b3.print();
	Journal j1=new Journal();
	j1.setDetails(50,70,"Techmax","Fun with Java");
	System.out.println("Details of First Journal");
	j1.print();
	Journal j2=new Journal();
	j2.setDetails(25,75,"Techneo","Fun with os");
	System.out.println("Details of Second Journal");
	j2.print();
	
	
	}
	
	
}
 
 
 
 