package basics_oop.ch3;

public class Cat extends Animal implements Pet {

    private String name;
    public Cat(String name)
    {
        super(4);
        this.name=name;
    }

    public Cat()
    {
        this("");
    }

    public void eat()
    {
        System.out.println("The cat eats mice");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String nume)
    {
        name=nume;
    }

    public void play()
    {
        System.out.println("The cat plays with the ball");
    }
}
