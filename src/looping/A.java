package looping;

public class A {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==4) {
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("end");
	}

}
