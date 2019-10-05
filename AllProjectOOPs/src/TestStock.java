import com.cg.stock.*;


public class TestStock {
	public static void main(String[] args) {
		Holder h = StockSingleton.getStock();
		//Holder h = new Stock();
		h.view();
		
		Broker b = StockSingleton.getStock();
		//Broker b = new Stock();

		b.get();
		
		System.out.println(h == b);
		
	}
}
