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
