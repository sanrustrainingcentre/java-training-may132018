
public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		
		animal = new Dog();
		animal.eat();
		
		animal = new Cat();
		animal.eat();
		
		
		System.out.println("\n\n\nArray of animals\n");
		Animal[] animals = new Animal[5];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new LabradorDog();
		animals[4] = new Animal();
		
		for (int index = 0; index < animals.length; index++)
		{
			Animal eachAnimalInArrayCell = animals[index];
			callEatMethod(eachAnimalInArrayCell);
			
			if (eachAnimalInArrayCell instanceof LabradorDog)
			{
				LabradorDog dog = (LabradorDog) eachAnimalInArrayCell;
				dog.doLabradorDogSpecificBehavior();
			}
		}
		

	}
	
	static void callEatMethod(Animal animal)
	{
		animal.eat();
	}

}
