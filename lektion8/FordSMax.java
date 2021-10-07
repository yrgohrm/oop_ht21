public class FordSMax implements DriveableWithHorn {
    public void turn(double angle) {
        System.out.println("The S-Max turns slowly");
    }

    public void accelerate(int amount) {
        System.out.println("The S-Max accelerates");
    }

    public void decelerate(int amount) {
        System.out.println("The S-Max is slowing down");
    }

    public void shiftGear(int gear) {
        System.out.println("The S-Max shifts to gear " + gear);
    }

    public void honk() {
        System.out.println("tuuuut");
    }
}
