import com.cg.emp.Booking;
import com.cg.emp.Hotel;
import com.cg.emp.Movie;


public class TestBooking {
	public static void main(String[] args) {
		
		Booking b1 = new Movie("Isha", 250, 26);
		Booking b2 = new Hotel("Jyoti", 2500, 406);
		
		b1.print();
		b2.print();
		
		Movie m1 = new Movie("Naman",350,21);
		
		m1.print();
	}
}
