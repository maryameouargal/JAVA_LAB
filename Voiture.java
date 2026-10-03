package classe.en.java;

public class Voiture {
	// Attributs
	private String marque;
	private String modele;
	private double speed; //
	private int year;
	private String couleur;

	// i did generate this Constructor by source only
	public Voiture() {
		this.marque = "Tesla";
		this.modele = "No idea";
		this.speed = 0.0;
		this.year = 2023;
		this.couleur = "GRAY";
		System.out.println("Constructor is called by source only ");
	}

	// 2. Constructeur paramétré
	public Voiture(String marque, String modele, double speed, int year, String couleur) {
		this.marque = marque;
		this.modele = modele;
		this.speed = speed;
		this.year = year;
		this.couleur = couleur;
	}

	// 3. Constructeur de copie
	public Voiture(Voiture secondCar) {
		this.marque = secondCar.marque;
		this.modele = secondCar.modele;
		this.speed = secondCar.speed;
		this.year = secondCar.year;
		this.couleur = secondCar.couleur;
		System.out.println("Constructor copy is called");
	}

	// i genrated the getters by source too
	public String getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public double getSpeed() {
		return speed;
	}

	public int getYear() {
		return year;
	}

	public String getCouleur() {
		return couleur;
	}

//the stters with validation 
	public void setMarque(String marque) {
		if (marque != null && !marque.trim().isEmpty()) {
			this.marque = marque;
		} else {
			System.out.println("Erreur : the mark should not be null");
		}
	}

	public void setModele(String modele) {
		if (modele != null && !modele.trim().isEmpty()) {
			this.modele = modele;
		} else {
			System.out.println("Erreur : the modele should not be null");
		}
	}

	public void setSpeed(double speed) {
		if (speed >= 0) {
			this.speed = speed;
		} else {
			System.out.println("Erreur : the speed should not be  negative.");
		}
	}

	public void setYear(int year) {
		int currentYear = java.time.Year.now().getValue();
		if (year > 1885 && year <= currentYear) {
			this.year = year;
		} else {
			System.out.println("Erreur : the year should be betewn  1886 and " + currentYear + ".");
		}
	}

public void setCouleur(String couleur) {
    if (couleur != null && !couleur.trim().isEmpty()) {
        this.couleur = couleur;
    } else {
        System.out.println("Erreur : the color should not be null .");
    }

	// METHODES
	public void accelerer(double augmentation) {
		if (augmentation > 0) {
			this.speed += augmentation;
			System.out.println(marque + " " + modele + " speed up to  " + augmentation + " km/h. New speed : "
					+ speed + " km/h.");
		} else {
			System.out.println("Erreur : the speed should go up not down so the numbre is postive ");
		}
	}

	public void brake(double reduction) {
		if (reduction > 0) {
			if (this.speed - reduction < 0) {
				this.speed = 0;
				System.out.println(marque + " " + modele + " stop .");
			} else {
				this.speed -= reduction;
				System.out.println(marque + " " + modele + " brake to " + reduction + " km/h. New speed: "
						+ speed + " km/h.");
			}
		} else {
			System.out.println("Erreur : the reduction of the speed should also be postive  ");
		}
	}

	public void afficher() {
		System.out.println("Infos of the car ");
		System.out.println("Marque  : " + marque);
		System.out.println("Modele  : " + modele);
		System.out.println("speed : " + speed + " km/h");
		System.out.println("year  : " + year);
		System.out.println("Color : " + couleur);

	}
	 public double calculerConsommation() {    
	        if (this.speed == 0) return 0.0;
	        else if (this.speed <= 50) return 8.0;
	        else if (this.speed <= 90) return 5.0;
	        else if (this.speed <= 130) return 7.0;
	        else return 12.0;
	    }
}
