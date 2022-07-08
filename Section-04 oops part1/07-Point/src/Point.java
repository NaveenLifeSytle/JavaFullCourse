
public class Point {
	  private int x;
	    private int y;

	    public Point() {
	    }

	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public double distance() {
	        return distance(0, 0);
	    }

	    public double distance(int x, int y) {
	       // return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	    	return x+y;
	    }

	    public double distance(Point another) {
	    	System.out.println(another.x);
	     	System.out.println(another.y);
	        return distance(another.x, another.y);
	      
	        
	    }

	    public int getX() {
	        return x;
	    }

	   

	    public int getY() {
	        return y;
	    }

	  

}
