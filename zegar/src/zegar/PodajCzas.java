
package zegar;
import java.util.*;
public class PodajCzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal = Calendar.getInstance();
		// zbiera info z systemu? o dacie

System.out.println("Roczek " + cal.get(Calendar.YEAR));
System.out.println("miesiaczek " + cal.get(Calendar.MONTH));
System.out.println("DZIONEK " + cal.get(Calendar.DATE));
System.out.println("GODZINKA " + cal.get(Calendar.HOUR));
System.out.println("MINUTKA " + cal.get(Calendar.MINUTE));
System.out.println("SEKUNDA " + cal.get(Calendar.SECOND));
System.out.println("SEKUNDA " + cal.get(Calendar.MILLISECOND));

Calendar calNewYork = Calendar.getInstance(); // TWORZY OBIEKT
calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York")); // PRZYPISUJE DO OBIEKTU TIME ZONE
   System.out.println(); 
 System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
   + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
	   System.out.println(); 
	   
	   PodajCzas gg = new PodajCzas();
	   
	  
	}

		
	}


