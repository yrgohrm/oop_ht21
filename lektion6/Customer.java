public class Customer {
    private String name;
    private String street;
    private int zip;
    private String city;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return String.valueOf(zip);
    }

    public void setZip(String zip) {
        if (zip.length() != 6) {
            // hantera fel på något vis!
        }
        else {
            String[] parts = zip.split(" ");
            this.zip = Integer.parseInt(parts[0])*100 + Integer.parseInt(parts[1]);
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void printToTerminal() {
        System.out.println(name);
        System.out.println(getStreet());
        System.out.println(getZip());
        System.out.println(city);
    }
}
