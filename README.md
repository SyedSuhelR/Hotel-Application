package ghghg;

public class Hotel {

	private int a[][]=new int [5][2];
	String name[]={"Moroccan Apricot Chicken","Rice Meatballs","Old-Fashioned Chicken Potpie","Chicken Alfredo Sandwiches","Modren cheeas"};
	{
	a[0][0]=500;
	a[1][0]=499;
	a[2][0]=399;
	a[3][0]=400;
	a[4][0]=50;
	}
	void setQuantity(int row,int val) {
	a[row][1]=val;
	}
	int getPrice(int i) {
	return a[i][0];
	}
	int getQuantity(int row) {
	return a[row][1];
	}
	
}


package ghghg;

public interface HotelInterface {
	void menu(Hotel h);
	
	 void bill(Hotel h);
	void takeOrder(Hotel h,int a);
}


package ghghg;

import java.util.Scanner;

public class Hotel_imple implements HotelInterface {
	
	public void menu(Hotel h) {
		for(int i=0;i<5;i++) {
		System.out.println(i+1+"." +" "+h.name[i]+" "+ h.getPrice(i));
		}
		System.out.println("Select 6 for bill");
		}

	
	public void bill(Hotel h) {
		System.out.println("Item Quantity Price Total") ;
		System.out.println("==================================================================") ;
		for(int i=0;i<5;i++) {
		if(h.getQuantity(i)>0)
		System.out.println(h.name[i]+" "+h.getQuantity(i)+" "+ h.getPrice(i)+" "+h.getQuantity(i)*h.getPrice(i)) ;
		}
		
		System.out.println("===================================================================") ;
				System.out.println("GST 18%");
				float total=0;
				for(int i=0;i<5;i++){
				total=total+(h.getQuantity(i)* h.getPrice(i));
				}

				System.out.println("cost="+total);
				float bill=total+(total*0.18f);
				System.out.println(" Total Bill="+bill) ;
				}

	public void takeOrder(Hotel h,int c) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number plates");
		try {
		int q=scan.nextInt();
		if(q<1) {
		throw new NoOfPlatesException();
		}
		else {
		int z=h.getQuantity(c-1);
		z=z+q;
		h.setQuantity(c-1, z);
		}
		}
		catch(NoOfPlatesException e) {
		System.out.println(e.getMessage());
		}
		}
		}


package ghghg;

public class HotelFactory {

	public HotelInterface createInstance() {
		return new  Hotel_imple();
		}

}


package ghghg;

public class NoOfPlatesException extends Exception {

	public String getMessage() {
		return " Min Number of places is one ";
		}

}


package ghghg;

import java.util.Scanner;

public class Hotel2D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Hotel h1=new Hotel();
		HotelFactory hf=new HotelFactory();
		HotelInterface hi=hf.createInstance();
		System.out.println("=======================Welcome to Hotel Phych=======================");
		
		System.out.print("Enter your Name:");
		String a=scan.next();
		System.out.print("Enter Phone Number: ");
		long l=scan.nextLong();
		System.out.println("Enter the choice");
		hi.menu(h1);
		int choice=scan.nextInt();
		while(choice<6) {
		hi.takeOrder(h1, choice);
		hi.menu(h1);
		choice=scan.nextInt();
		}
		hi.bill(h1);
		}
		}
