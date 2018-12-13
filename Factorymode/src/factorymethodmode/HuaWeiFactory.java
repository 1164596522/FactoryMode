package factorymethodmode;

public class HuaWeiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }
}
