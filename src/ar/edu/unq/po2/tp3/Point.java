package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	
	public Point() {
		this(0,0);
	}
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	public void moverX(int x) {
		this.x = x;
	}
	
	public void moverY(int y) {
		this.y = y;
	}
	
	
	public Point sumarseCon(Point punto) {
		return new Point(this.x + punto.getX(), this.y + punto.getY());
	}
	
}
