package Proiect.CasaLicitatii;
class Main {
    public static void main(String[] args) {
        CasaLicitatii casa_licitatii = new CasaLicitatii();

        Tablou tablou1 = new Tablou("Carul cu boi", 100);
        Tablou tablou2 = new Tablou("Anemone", 200);
        Sculptura sculptura1 = new Sculptura("Cumintenia Pamantului", 150);
        Sculptura sculptura2 = new Sculptura("Domnisoara Pogany", 75);

        casa_licitatii.addItem(tablou1);
        casa_licitatii.addItem(tablou2);
        casa_licitatii.addItem(sculptura1);
        casa_licitatii.addItem(sculptura2);

        for (Item item : casa_licitatii) {
            System.out.println("Item: " + item.getName() + " Price: " + item.getPrice());
        }

        casa_licitatii.purchaseItem(tablou2);

        System.out.println("****** Updated List of items ******");
        for (Item item : casa_licitatii) {
            System.out.println("Item: " + item.getName() + " Price: " + item.getPrice());
        }
    }
}



