package facade;

public class FacadeTest {
    public static void main(String[] args) {
        MobliePhone phone = new MobliePhone();
        phone.call();
        phone.close();
        phone.takePhoto();
    }

}
