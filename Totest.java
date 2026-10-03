package classe.en.java;

public class ToTest {
	public static void main(String[] args) {
		System.out.println("just the call of the constructeur without values ");
		Voiture v1 = new Voiture();
		System.out.println("v1 : " + v1.getMarque() + " " + v1.getModele() + " " + v1.getSpeed() + " " + v1.getYear()
				+ " " + v1.getCouleur());

		System.out.println("\n the call with the parametre ");
		Voiture v2 = new Voiture("Not tesla ", "NO idea", 250.0, 2023, "Black");
		System.out.println("v2 : " + v2.getMarque() + " " + v2.getModele() + " " + v2.getSpeed() + " " + v2.getYear()
				+ " " + v2.getCouleur());

		System.out.println("\n just the call of the constructeur copie  ");
		Voiture v3 = new Voiture(v2);
		System.out.println(" v3 : " + v3.getMarque() + " " + v3.getModele() + " " + v3.getSpeed() + " " + v3.getYear()
				+ " " + v3.getCouleur());

		System.out.println("\n we will have the same values normally");
		System.out.println("the programme will run now ");

		System.out.println("\n Test");

		Voiture v4 = new Voiture("nothing", "Corolla", 45.5, 2023, "red");
		v4.setSpeed(-50);        
		System.out.println("after setSpeed(-50) : " + v4.getSpeed() + " (doit rester 45.5)");

		v4.setYear(3000);       
		System.out.println("aftersetYear(3000) : " + v4.getYear() + " (doit rester 2023)");

		v4.setMarque("   ");     
		System.out.println("after setMarque(\"   \") : '" + v4.getMarque() + "' (doit rester Toyota)");

		v4.setMarque(null);      
		System.out.println("aftersetMarque(null) : '" + v4.getMarque() + "' (doit rester Toyota)");

		System.out.println("\n Test with just the valid ones ");
		v4.setSpeed(120.5);      
		v4.setYear(2020);        
		System.out.println("New : " + v4.getMarque() + " / "
		        + v4.getSpeed() + " / " + v4.getYear());
	}
}
