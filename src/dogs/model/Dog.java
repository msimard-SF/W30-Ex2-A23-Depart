package dogs.model;

public class Dog {  // La classe est tr�s simple ici mais il pourrait avoir des validations ou des algos plus complexes.
	
	private int id;
	private String name;
	private String breed;  // Id�alement faire une classe Breed (pr�f�rer � une enum)
	
	public Dog(String name, String breed, String color, int age) {
		//TODO: calculer l'id --> un no unique pour identifier un chien
		this.name = name;
		this.breed = breed;
	}

	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

}
