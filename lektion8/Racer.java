public class Racer {
    public static void main(String[] args) {
        FordSMax mySmax = new FordSMax();
        mySmax.honk();

        Driveable car1 = mySmax; 
        Driveable car2 = new BugattiChiron();
        race(car1);
        race(car2);

        FordSMax otherCar = (FordSMax) car2;
        otherCar.honk();
    }

    private static void race(Driveable car) {
        car.accelerate(100);
        car.shiftGear(2);
        car.shiftGear(3);
        car.shiftGear(4);
        car.shiftGear(5);
        car.shiftGear(6);
        car.decelerate(20);
        car.shiftGear(5);
        car.shiftGear(4);
        car.shiftGear(3);
        car.turn(10);
        car.accelerate(10);
        car.shiftGear(4);
        car.accelerate(10);
        car.shiftGear(5);
        car.shiftGear(6);
    }
}
