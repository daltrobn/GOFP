package petstore0;

public abstract class Animal
{
    protected String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public abstract void moveAround();

    public abstract void makeSound();

    public String getName()
    {
        return this.name;
    }
}
