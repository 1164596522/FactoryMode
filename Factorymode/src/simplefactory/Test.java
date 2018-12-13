package simplefactory;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.createPhone("华为").play();
        phoneFactory.createPhone("小米").play();
    }
}
