package tp_composite.ShapeShifter;

import java.util.List;

public interface IShapeShifter{ 
	IShapeShifter compose(IShapeShifter component); 
	public int deepest(); 
	public IShapeShifter flat(); 
	public List<Integer> values(); 
} 