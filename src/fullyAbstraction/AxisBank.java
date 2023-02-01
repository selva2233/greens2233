package fullyAbstraction;

public class AxisBank implements RbiBank {

	@Override
	public void savings() {
		System.out.println("5%");		
	}

	@Override
	public void fixed() {
		System.out.println("8%");		
	}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.savings();
	a.fixed();
}
}
