package Proiect.CasaLicitatii;

class Tablou implements Item {
    private String name;
    private int price;

    public Tablou(String name, int price) {
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