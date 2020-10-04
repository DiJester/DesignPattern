package facade;

public class MobliePhone {
    private Phone phone = new PhoneImp();
    private Camera camera = new CameraImp();
    public void call(){
        phone.dail();
    }
    public void close(){
        phone.hangUp();
    }
    public void takePhoto(){
        camera.shoot();
    }
    public void shootVideo(){
        camera.shoot();
    }
}
