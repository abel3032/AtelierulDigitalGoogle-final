package Proiect.CasaLicitatii;

class Sculptura implements Item {
    private String name;
    private int price;

    public Sculptura(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

