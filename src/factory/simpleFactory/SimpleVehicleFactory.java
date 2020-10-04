package factory.simpleFactory;

import factory.factoryProduct.Car;
import factory.factoryProduct.Plane;

//�򵥹����Ŀ���չ�Բ���
public class SimpleVehicleFactory {
     public Car createCar() {
    	 return new Car();
     };
     
     public Plane createPlane() {
    	 return new Plane();
     };
}
