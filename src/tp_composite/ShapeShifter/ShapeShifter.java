package tp_composite.ShapeShifter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeShifter implements IShapeShifter {
	private List<IShapeShifter> components = new ArrayList<IShapeShifter>(); 

	public ShapeShifter(ArrayList components) {
		this.components = components;
	}

	@Override
	public IShapeShifter compose(IShapeShifter component) {
		List<IShapeShifter> comps = Arrays.asList(component, this);
		return new ShapeShifter(new ArrayList<IShapeShifter>(comps));
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//
	

}
