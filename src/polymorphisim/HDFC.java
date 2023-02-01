package polymorphisim;

public class HDFC extends RbiBank {
@Override
public void savings() {
	System.out.println("3%");
}
public static void main(String[] args) {
	HDFC h=new HDFC();
	h.savings();
	h.fixed();	
}
}
