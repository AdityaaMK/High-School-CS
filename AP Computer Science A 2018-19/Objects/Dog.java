public class Dog{

	private String breed;
	private int age;

	//default constructor
	public Dog(){
		breed = "Pug";
		age = 5;
	}

	/*
	public Dog(String dogBreed, int dogAge){
		breed = dogBreed;
		age = dogAge;
	}
	*/

	//non-default constructor
	public Dog(String breed, int age){
		this.breed = breed;
		this.age = age;
	}

	public String getBreed(){
		return breed;
	}

	//can access memory from print statement and properly print out object
	public String toString(){
		return "This is a "+breed+" and it is "+age;
	}

	/*
	public void setBreed(String breed){
		this.breed = breed;
	}
	*/

}