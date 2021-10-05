public class RentalShop {
    public static void main(String[] args) {
        RentalItem r1 = new RentalItem("Borr", 30);
        RentalItem r2 = new RentalItem("Hammare", 10);
        RentalItem r3 = new RentalItem("Cementblandare", 50);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        
        System.out.println();
        RentalItem.setBasePrice(0);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
