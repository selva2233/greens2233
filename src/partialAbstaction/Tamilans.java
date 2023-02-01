package partialAbstaction;

public class Tamilans extends Indians {

	@Override
	public void breakfast() {
		System.out.println("Dosai");
	}
public static void main(String[] args) {
	Tamilans t=new Tamilans();
	t.breakfast();
	t.voterID();
	t.pancard();
  }
}
