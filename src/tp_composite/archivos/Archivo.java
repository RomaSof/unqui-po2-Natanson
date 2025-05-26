package tp_composite.archivos;

import java.time.LocalDate;

public class Archivo implements FileSystem{
	private int size;
	private LocalDate lastModified;
	private String name;
	
	//constructor
	public Archivo(int size, String name, LocalDate date) {
		this.size = size;
		this.name = name;
		this.lastModified = date;
		
		//LocalDate today = LocalDate.now();
	}

	//interface
	@Override
	public int totalSize() {
		return this.size;
	}

	@Override
	public void printStructure() {
		System.out.println("" + this.name + "" + this.lastModified + "" + this.size);
	}

	@Override
	public LocalDate lastModified() {
		return this.lastModified;
	}

	@Override
	public FileSystem oldestElement() {
		return this;
	}
	
	//getters
	public int getSize() {
		return this.size;
	}
	
	public String getName() {
		return this.name;
	}
	
	//setters
	public void modify(LocalDate date) { //maybe also change size?
		this.lastModified = date; 
	}

}
