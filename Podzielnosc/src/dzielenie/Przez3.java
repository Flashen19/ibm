package dzielenie;
import java.util.Scanner;
public class Przez3 {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Podaj liczb�, kt�r� dzilimy: ");
		int liczba  = scan.nextInt();
		int l;
		
		
		
	 int x;
		for ( x = liczba; x > 0; x = --liczba ) {
				if (liczba %3 == 0) {
					System.out.println(liczba);
									}
				
	}
		int y;
		for ( y = liczba; y > 0; y = --liczba ) {
				if (liczba %5 == 0) {
					System.out.println(liczba);
									}
				
	}
				
		
	}

}
