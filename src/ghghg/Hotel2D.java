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

