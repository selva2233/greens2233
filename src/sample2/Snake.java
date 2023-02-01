package sample2;

import sample.Animal;
//import sample.Dog;

public class Snake extends Animal{
     public void bite()
     {
	System.out.println("biting");
     }
     

public static void main(String[] args) {
	Snake d=new Snake();
	d.bite();
	d.eat();
	
}

}