package ar.edu.unq.po2.ShapeShifters;
import java.util.ArrayList;
import java.util.List;

public class ComposedShapeShifter implements IShapeShifter{

	private List<IShapeShifter> contained;
	
	public ComposedShapeShifter(List<IShapeShifter> contained) {
		this.contained = contained;
	}
	
	
	public IShapeShifter compose(IShapeShifter i) {
		return new ComposedShapeShifter(List.of(this, i));
	}
	
	
	public int deepest() {
		int max = 0;
		for (IShapeShifter s : contained) {
			int depth = s.deepest();
			if (depth > max) {
				max = depth;
			}
		}
		return 1 + max;
	}
	
	
	public IShapeShifter flat() {
		List<Integer> values = this.values();
		List<IShapeShifter> leafs = new ArrayList<IShapeShifter>();
		for (Integer value : values) {
			leafs.add(new LeafShapeShifter(value));
		}
		return new ComposedShapeShifter(leafs);
	}
	
	
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		for (IShapeShifter s : contained) {
			values.addAll(s.values());
		}
		return values;
	}
	
}
