package ar.edu.unq.po2.ShapeShifters;
import java.util.List;

public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter i);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
}
