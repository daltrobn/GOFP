package petstore0;

public abstract class Animal
{
    protected String name;
    protected String type;
    public Animal(String name)
    {
        this.name = name;
    }
    public Animal(String type, String name)
    {
        this.name = name;
        this.type = type;
    }
    public abstract void moveAround();

    public abstract void makeSound();

    public String getName()
    {
        return this.name;
    }
    public String getType()
    {
        return this.type;
    }
}
