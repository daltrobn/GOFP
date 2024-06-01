package petstore0a;

public class Dog extends Animal {
    String sound = "Woof woof!";
    public Dog(String name)
    {
        super(name);

    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + " The dog is moving around");
    }
}