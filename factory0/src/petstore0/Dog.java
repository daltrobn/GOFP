package petstore0;

public class Dog extends Animal {
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + " The dog is moving around");
    }
}