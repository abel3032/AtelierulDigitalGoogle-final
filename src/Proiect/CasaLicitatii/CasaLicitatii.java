package Proiect.CasaLicitatii;
import java.util.ArrayList;
import java.util.Iterator;

class CasaLicitatii implements Iterable<Item> {
    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void purchaseItem(Item item) {
        System.out.println("Item: " + item.getName() + " is purchased for " + item.getPrice());
        items.remove(item);
    }

    public Iterator<Item> iterator() {
        return items.iterator();
    }
}

