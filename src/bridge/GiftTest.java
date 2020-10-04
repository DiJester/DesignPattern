package bridge;

public class GiftTest {
    public static void main(String[] args) {
        Boy boy = new Boy("ZhangSan");
        Girl girl = new Girl("Lucy");
        boy.chase(girl,new ColdGift(new Car("Ferrari SF1000")));
    }
}
