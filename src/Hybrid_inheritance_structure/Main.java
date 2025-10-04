package Hybrid_inheritance_structure;

public class Main {
    public static void main(String[] args) {
        EBike eBike = new EBike();
        eBike.eBikeTurnOn();
        eBike.bikeTurnOn();
        eBike.turnOn();

        System.out.println();

        ECar eCar = new ECar();
        eCar.eCarTurnOn();
        eCar.carTurnOn();
        eCar.turnOn();
    }
}
