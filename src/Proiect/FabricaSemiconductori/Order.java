package Proiect.FabricaSemiconductori;

public class Order {
    private DiodeTransistor diodeTransistor;
    private String adresa_livrare;

    public Order(DiodeTransistor diodeTransistor, String adresa_livrare) {
        this.diodeTransistor = diodeTransistor;
        this.adresa_livrare = adresa_livrare;
    }

    public void ship() {
        System.out.println("Se livreaza " + diodeTransistor.getType() +" din "+ diodeTransistor.getMaterial() +", ce lucreaza la o tensiune de " + diodeTransistor.getV() +" volti si la un curent de "+diodeTransistor.getCurent()+ " mA, catre " + adresa_livrare);
    }
}
