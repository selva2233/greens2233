package sample;

//import sample2.Snake;



public class Dog extends Animal {
	public void bark() {
		System.out.println("barking");

	}
	

	public static void main(String[] args) {
		Dog e=new Dog();
		e.bark();
		e.eat();
	

	}

}
