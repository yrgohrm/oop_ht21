public class BugattiChiron implements Driveable {
    public void turn(double angle) {
        System.out.println("SKRIIIIIII the Chiron turns violently");
    }

    public void accelerate(int amount) {
        System.out.println("BRAAAAABAPPAPPAPPNAAAAAAA the Chiron accelerates quickly");
    }

    public void decelerate(int amount) {
        System.out.println("IIIHIIHIIHIIH the Chirons powerful brakes decelerates the car");
    }

    public void shiftGear(int gear) {
        System.out.println("CLICKCLICK The Chiron shifts gear into number " + gear);
    }
}
