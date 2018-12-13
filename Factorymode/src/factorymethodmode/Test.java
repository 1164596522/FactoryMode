package factorymethodmode;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory;

        phoneFactory = new HuaWeiFactory();
        phoneFactory.createPhone().play();

        phoneFactory = new XiaoMiFactory();
        phoneFactory.createPhone().play();
    }
}
