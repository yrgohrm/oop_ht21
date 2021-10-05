public class PrivPub {
    public static void main(String[] args) {
        Data value = new Data();

        value.pubData = 1;
        System.out.println(value.pubData);

        value.privData = 1;
        System.out.println(value.privData);


        value.setPrivData(123);

        value.init();

        Singleton s = Singleton.getInstance();
    }
}
