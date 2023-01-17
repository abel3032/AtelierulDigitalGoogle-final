package Proiect.FabricaSemiconductori;

public class Main {
    public static void main(String[] args) {
        DiodeTransistor diodeTransistor1 = new DiodeTransistor.Builder("dioda")
                .material("silicon")
                .breakdownVoltage(50)
                .maxCurrent(100)
                .build();
        DiodeTransistor diodeTransistor2 = new DiodeTransistor.Builder("tranzistor")
                .material("germaniu")
                .breakdownVoltage(45)
                .maxCurrent(60)
                .build();

        Order order1 = new Order(diodeTransistor1, " Strada Brailei, numarul 228 Galati, Romania");
        Order order2 = new Order(diodeTransistor2, " Strada Foisorului, numarul 17 Bucuresti, Romania");
        order1.ship();
        order2.ship();
    }
}
