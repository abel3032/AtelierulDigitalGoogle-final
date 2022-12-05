package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Topping milk = new Milk(coffee);
        Beverage milkChocolateCoffee = new Chocolate(milk);
        System.out.println(milkChocolateCoffee.getDescription());
        System.out.println(milkChocolateCoffee.getCost());
    }

}
