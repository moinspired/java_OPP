
public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something");
		energyLevel-=5;
	}
	public void eatBannas() {
		System.out.println("Gorilla's satisfide.");
		energyLevel+=10;
	}
	public void clim() {
		System.out.println("Gorilla climed a tree.");
		energyLevel-=10;
	}
}
