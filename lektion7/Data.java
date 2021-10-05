public class Data {
    public int pubData;
    private int privData;

    public void setPrivData(int privData) {
        init();
        this.privData = privData;
    }

    private void init() {
        pubData = 123;
        privData = 823;
    }
}
