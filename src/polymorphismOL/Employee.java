package polymorphismOL;

public class Employee {
	public void empDetails() {
		//based on arguments
		System.out.println("This is employee Details");
	}
 public	void empDetails(int age,int rollnumber) {
        System.out.println(age);
        System.out.println(rollnumber);
}
//based on data types
  public void empDetails(char name) {
	System.out.println(name);
   }
//based on order of arguments
  public void empDetails(float salary,long cellnumber) {
	System.out.println(salary);
	System.out.println(cellnumber);
}
  public void empDetails(long cellnumber,float salary) {
	System.out.println(cellnumber);
	System.out.println(salary);
}
  public static void main(String[] args) {
	Employee e=new Employee();
	e.empDetails();
	e.empDetails('s');
	e.empDetails(10, 456);
	e.empDetails(15000.300f, 9698679850L);
	e.empDetails(9659879463L, 18000.345f);
  }
}
