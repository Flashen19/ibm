package metoda;
import java.util.*;
public class Najmniejsza {

	 public static void metot(int x, int y, int z) {
	if ((x < y) && (x < z)) 
		 System.out.println("najmniejsza jest  " + x);
		  
		  if ((y < x) && (y < z)) 
			 System.out.println("najmniejsza jest  " + y);
			 
		  if ((z < x) && (z < y))
			 System.out.println("najmniejsza jest  " + z);
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("podaj 1 liczb�"  );

		int x  =scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("podaj 2 liczb�"  );
		
		 int y =scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("podaj 3 liczb�"  );
		int z =scan2.nextInt();
		
	
	metot(x, y, z);
	
					 
					
					 

	
	}

}
