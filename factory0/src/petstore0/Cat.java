package petstore0;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meeow");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + "The cat is moving around");
    }
}
