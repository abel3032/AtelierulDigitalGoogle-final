package basics_oop.ch3;

public class Fish extends Animal implements Pet{

    public void walk()
    {
        System.out.println("Fish cant walk");
    }

    public Fish()
    {
        super(0);
    }

    public void eat()
    {
        System.out.println("Fish eat algae");
    }

    public String getName()
    {
        return "sturion";
    }

    public void setName(String nume)
    {
        nume="peste";
    }

    public void play()
    {
        System.out.println("Fish play");
    }


}
