import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        int someData = 3;
        logger.debug("Detta är debuginfo");
        logger.info("Detta är bra information");
        logger.warn("Detta är en varning med data: {}", someData);

        test1();

        try {
            throw new RuntimeException("oj ett fel");
        }
        catch (RuntimeException ex) {
            logger.error("Det blev fel", ex);
        }
    }

    private static void test1() {
        System.out.println("test1");
        test2();
    }

    private static void test2() {
        System.out.println("test2");
        System.out.println("test2 2");
    }
}
