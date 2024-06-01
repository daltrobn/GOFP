package petstore0a;

public class Dog extends Animal {

    public Dog(String name)
    {
        super(name);

    }

    @Override
    public void makeSound() {
        System.out.println();
    }

    @Override
    public void moveAround() {
        System.out.println();
    }
}