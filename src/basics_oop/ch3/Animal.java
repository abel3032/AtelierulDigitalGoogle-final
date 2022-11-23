package basics_oop.ch3;

public abstract class Animal {

    protected int legs;

    protected Animal(int arg_legs)
    {
        legs=arg_legs;
    }

    protected Animal()
    {

    }

    public abstract void eat();

    public void walk()
    {
        System.out.println("The animal walks on " + legs);
    }
}
