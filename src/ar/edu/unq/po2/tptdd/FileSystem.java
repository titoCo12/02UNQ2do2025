package ar.edu.unq.po2.tptdd;

public interface FileSystem {

	public int totalSize();
	
	public void printStructure();
	
	public Component lastModified();
	
	public Component oldestElement();
	
	
}
