public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Bosse Bredsladd");
        customer.setStreet("Storgatan 1");
        customer.setZip("412 34");
        customer.setCity("Göteborg");

        customer.setZip("nisse bosse");

        customer.printToTerminal();

        Customer cust2 = new Customer();
        cust2.setName("Lena Lamm");
        cust2.setStreet("Kungsgatan 22");
        cust2.setZip("123 45");
        cust2.setCity("Storuman");

        cust2.printToTerminal();
    }
}