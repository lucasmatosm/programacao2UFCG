package princeton;

public class Point {
	private double x, y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double x(){
		return x;
	}
	
	public double y(){
		return y;
	}
	
	public double distanceTo(Point z){
		return Math.sqrt(Math.pow((z.x() - x()), 2) + Math.pow((z.y() - y()), 2));
	}

}
