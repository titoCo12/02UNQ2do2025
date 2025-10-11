package ar.edu.unq.po2.ShapeShifters;

import java.util.ArrayList;
import java.util.List;

public class LeafShapeShifter implements IShapeShifter{

	private int value;
	
	public LeafShapeShifter(int value) {
		this.value = value;
	}
	
	
	public IShapeShifter compose(IShapeShifter shifter) {
		List<IShapeShifter> list = new ArrayList<IShapeShifter>();
		list.add(this);
		list.add(shifter);
		return new ComposedShapeShifter(list);
	}
	
	
	public int deepest() {
		return 0;
	}
	
	
	public IShapeShifter flat() {
		return this;
	}
	
	
	public List<Integer> values() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(this.value);
		return list;
	}
	
	
}
