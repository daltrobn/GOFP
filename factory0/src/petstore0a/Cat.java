package petstore0a;

public class Cat extends Animal
{

    String sound = "Meeeeoooow!";
    public Cat(String name)
    {
        super(name);

    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + "The cat is moving around");
    }
}
