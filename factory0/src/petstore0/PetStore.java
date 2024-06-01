package petstore0;

public class PetStore {
    private Animal pet;

    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        Animal pet = petStore.orderPet("Mark", "Cat" );
        pet.makeSound();
        pet.moveAround();
    }

    public Animal orderPet(String petName, String petType)
    {
        if (petType.equals("Dog")){
            this.pet = new Dog(petName);
        }
        else if (petType.equals("Cat")) {
            this.pet = new Cat(petName);
        }
        else {
            throw new IllegalArgumentException(petType + " is not a valid pet category");
        }
        return pet;

    }
}
