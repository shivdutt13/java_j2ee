package core.string.stringBuffer.stringBuilder;

class PointCoordinates{
	private int x,y;
	
	public PointCoordinates(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String toString(){
		return "X = "+ x + " " + "Y = " + y;
	}
}

public class ToStringComareToImpl {
	public static void main(String args[]){
		PointCoordinates p = new PointCoordinates(10, 10);
		System.out.println("Object toString() method : "+p);
		String s = p + " testing";
		System.out.println(s);
	}
}
