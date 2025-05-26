package tp_composite.archivos;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Directorio implements FileSystem {
	private List<FileSystem> files = new ArrayList<FileSystem>();
	private LocalDate lastModified;
	private String name;
	
	//constructor
	public Directorio(String name, LocalDate date) {
		this.name = name;
		this.lastModified = date;
	}

	//interface
	@Override
	public int totalSize() {
		int total = 0;
		for(FileSystem i : files) {
			total += i.totalSize();
		}
		return total;
	}

	@Override
	public void printStructure() {
		this.printInfo(); //prints its own info
		for(FileSystem f : files) { //plus all its achieves
			f.printStructure();
		}
	}

	@Override
	public LocalDate lastModified() {
		return this.lastModified;
	}

	@Override
	public FileSystem oldestElement() {
		return
				files.isEmpty()? this : this.oldestElementInFiles();
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	
	//methods
	public void addFile(FileSystem file, LocalDate date) {
		files.add(file);
		this.lastModified = date;
	}
	
	public void removeFile(FileSystem file, LocalDate date) {
		files.remove(file);
		this.lastModified = date;
	}
	
	public void printInfo() {
		System.out.println("" + this.name + "" + this.lastModified + "" + this.totalSize());
	}
	
	public FileSystem oldestElementInFiles() {
		FileSystem oldest = files.get(0);
		for(FileSystem f : files) { //plus all its achieves
			oldest = this.oldestBetween(oldest, f);
		}
		return oldest;
	}
	
	
	public FileSystem oldestBetween(FileSystem file1, FileSystem file2) {
		return
				file1.lastModified().isBefore(file2.lastModified())? file1 : file2;
	}

}
