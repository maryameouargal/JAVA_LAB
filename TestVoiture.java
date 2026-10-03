package classe.en.java;

public class TestVoiture {
	public static void main(String[] args) {
		// 1. Constructeur par défaut
		System.out.println("just the call of the constructeur without parametres");
		Voiture c1 = new Voiture();
		c1.afficher();

		// 2. Constructor paramétré
		System.out.println("\n the call with the parametre ");
		Voiture c2 = new Voiture("Tesla", "Coro", 0.0, 2023, "white");
		c2.afficher();

		// 3. Constructor de copie
		System.out.println("\n just the call of the constructeur copie ");
		Voiture c3 = new Voiture(c2);
		c3.afficher();

		// 4. Comparaison de références
		System.out.println("\n Comparaison -");
		System.out.println("v1 == v2 ? " + (c1 == c2));
		System.out.println("v2 == v3 ? " + (c2 == c3));
		System.out.println("v2.equals(v3) ? " + c2.equals(c3));

		// modifis of c2
		System.out.println(" Modification of c2 ");
		c2.accelerer(120);
		c2.brake(30);
		c2.afficher();

		// Modification de voiture3
		System.out.println("\n modification of c3");
		c3.accelerer(80);
		c3.afficher();

		// Test setters with validation
		System.out.println("\n Test  setters with validation ");
		c2.setSpeed(-50);
		c2.setYear(1800);
		c2.setMarque("");
		c2.afficher();

//	     the final comparaision
		System.out.println("\n Comparaison finale ");
		c2.afficher();
		c3.afficher();

	}
}
