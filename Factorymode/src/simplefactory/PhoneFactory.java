package simplefactory;

public class PhoneFactory {
    public Phone createPhone(String name){
        if (name.equals("华为")){
            return new HuaWei();
        }else if (name.equals("小米")) {
            return new XiaoMi();
        }else {
            return null;
        }
    }
}
