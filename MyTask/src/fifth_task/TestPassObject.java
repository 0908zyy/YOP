package fifth_task;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 myCircle=new Circle2(1);
		
		int n=5;
		printAreas(myCircle,n);
		
		System.out.println("\n"+"Raius is "+myCircle.getRadius());
		System.out.println("n is "+n);
		

	}

	private static void printAreas(Circle2 c, int times) {
		// TODO Auto-generated method stub
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
		
	}

}
