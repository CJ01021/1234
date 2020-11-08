package xxx;

public class Cube {
	private double aaaa;
	private int high;
	public Cube() {
		
	}
	public Cube(double length) throws CubeException {
		if (length > 0)
		    this.length = length;
		else
			throw new CubeException("980");
	}
	
	public double getlength() {
		return length;
	}
	public void setlength(double length) {
		this.length=length;
	}
	public double getVolume() {
		return Math.pow(length,3);
	}

}
