package facade;

public class PhoneImp extends Phone{
    @Override
    public void dail() {
        System.out.println("Calling...");
    }

    @Override
    public void hangUp() {
        System.out.println("Hang up...");
    }
}
