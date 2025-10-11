package ar.edu.unq.po2.tpComposite;
import java.util.List;

public class CarroDeCompras {

	private List<Product> products;
	
	private void setElements(List<Product> list) {
		products = list;
	}
	
	
	public List<Product> getElements() {
		return this.products;
	}
	
	
	public int totalRounded() {
		int total = 0;
		for (Product p : products) {
			total += p.getPrice();
		}
		return total;
	}
	
	
	public float total() {
		float total = 0;
		for (Product p : products) {
			total += p.getPrice();
		}
		return total;
	}
	
}
