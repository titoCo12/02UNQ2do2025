package ar.edu.unq.po2.tpComposite;
import java.time.LocalDate;

public class File extends Component{

	private int size;
	
	public File(String name, LocalDate creation, Component parent, int size) {
		super(name, creation, parent);
		this.size = size;
	}
	
	
	public int getSize() {
		return this.size;
	}
	
}
