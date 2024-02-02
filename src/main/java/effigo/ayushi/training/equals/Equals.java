package effigo.ayushi.training.equals;

public class Equals {
	public static void main(String[] args) {
		Employe emp1 = new Employe(1001, "Ayushi");
		Employe emp2 = new Employe(1002, "Dhruv");
		Employe emp3 = new Employe(1001, "Ayushi");
		
		Employe emp4 = emp2;
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp4.equals(emp2));
		
		System.out.println("emp1 hashcode: " + emp1.hashCode());
		System.out.println("emp2 hashcode: " + emp2.hashCode());
		System.out.println("emp3 hashcode: " + emp3.hashCode());
		System.out.println("emp4 hashcode: " + emp4.hashCode());
		
	}
}
