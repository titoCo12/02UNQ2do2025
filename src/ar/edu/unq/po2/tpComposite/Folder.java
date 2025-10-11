package ar.edu.unq.po2.tpComposite;

import java.time.LocalDate;
import java.util.ArrayList;

public class Folder extends Component{

	private ArrayList<Component> content;
	
	public Folder(String name, LocalDate creation, Component parent) {
		super(name, creation, parent);
		this.content = new ArrayList<Component>();
	}
	
	public void addContent(Component comp) {
		this.content.add(comp);
	}
	
	public int getSize() {
		int total = 0;
		for (Component c : content) {
			total += c.getSize();
		}
		return total;
	}
	
	
}
