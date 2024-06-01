package petstore0a;

public class PetStore {
    private Animal pet;

    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        Animal pet = petStore.orderPet("Mark", "Dog" );
        pet.makeSound();
        pet.moveAround();
    }

    public Animal orderPet(String petName, String petType)
    {

        return AnimalFactory.createAnimal(petName,petType);

    }
}
