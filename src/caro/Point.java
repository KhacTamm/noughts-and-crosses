package caro;

/**
 *
 * @author Khac Tam
 */
public class Point {
    public int x, y;
	
        public Point(){
            x = 0;
            y = 0;
        }
        
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void log() {
		System.out.println("x: "+ this.x + "| y: " + this.y);
	}
}
