package ar.edu.unq.po2.tpComposite;

//No veo el enfoque de este ejercicio. No parece ser un caso de Composite, lo que se me ocurre es que 
// pensemos en representar tambien una clase bolsa que pueda contener otras bolsas o productos?


public class Product {

	private float price;
	private String name;
	
	public float getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
}
