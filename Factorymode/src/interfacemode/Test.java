package interfacemode;

public class Test {
    public static void main(String[] args) {
        Phone phone;

        phone = new HuaWei();
        phone.play();

        phone = new XiaoMi();
        phone.play();
    }
}
