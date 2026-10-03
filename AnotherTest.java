package classe.en.java;

public class AnotherTest {
	public static void main(String[] args) {
		Voiture v = new Voiture("Toyota", "cora", 50.0, 2023, "Red");

		System.out.println("the normal state ");
		v.afficher();

		System.out.println("speed to 30 km/h ");
		v.accelerer(30);
		System.out.println("speed : " + v.getSpeed());

		System.out.println("\nbrake to  40 km/h ");
		v.brake(40);
		System.out.println("speed : " + v.getSpeed());

		System.out.println("\n brake (100 km/h)");
		v.brake(100);
		System.out.println("speed: " + v.getSpeed() + " (should be 0)");

		System.out.println("\n those that will not work ");
		v.accelerer(-10);
		v.brake(-5);
		System.out.println("the final speed : " + v.getSpeed() + " (should be  0)");

		System.out.println("Consumption at 70 km/h : " + v.calculerConsommation() + " L/100km");

		v.setSpeed(150);
		System.out.println("Consumption at 150 km/h : " + v.calculerConsommation() + " L/100km");
		
		System.out.println("year after setYear(1800) : " + v.getYear());

		v.setYear(2050); 
		System.out.println("Année after setYear(2050) : " + v.getYear());

		System.out.println("\n fianl state ");
		v.afficher();

	}
}
