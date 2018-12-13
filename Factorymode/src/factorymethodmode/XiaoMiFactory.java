package factorymethodmode;

public class XiaoMiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }
}
