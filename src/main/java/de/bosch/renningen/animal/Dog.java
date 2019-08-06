package de.bosch.renningen.animal;

public class Dog extends Animal implements KannLautGeben {

	private int birthday = 10;

	public Dog() {
		this("Unnamed");
	}

	public Dog(String name) {
		this(name, 17);
	}

	public Dog(String name, int birthday) {
		super(name);
		this.birthday = birthday;
	}

	@Override
	public void gibLaut() {
		System.out.println("Wuff");
	}

	public int getAge() {
		// calculate age...
		return birthday * 10;
	}

	public void bark() {
		System.out.println("Woof");
	}

	@Override
	public String toString() {
		return "Dog: " + getName();
	}

}
