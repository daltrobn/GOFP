package petstore0a;

public class AnimalFactory
{
    public static Animal createAnimal(String petName, String petType)
    {
        Animal pet;

        if (petType.equals("Dog")){
            pet = new Animal(petName, petType) {
                @Override
                public void moveAround() {
                    System.out.println();
                }

                @Override
                public void makeSound() {
                    System.out.println();
                }
            };
        }
        else if (petType.equals("Cat")) {
            pet = new Animal(petName) {
                @Override
                public void moveAround() {
                    System.out.println();
                }

                @Override
                public void makeSound() {
                    System.out.println();
                }
            };
        } else {
            throw new IllegalArgumentException(petType + " is not a valid pet category");
        }

        return pet;
    }
}
