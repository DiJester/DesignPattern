package factory.abstractFactory;

import factory.factoryProduct.Food;
import factory.factoryProduct.Vehicle;
import factory.factoryProduct.Weapon;

public class AbstractFactoryTest {
	
	public static void main(String [] args) {
       AbstractFactory factory = new ModernFactory();
       Food food = factory.createFood();
       Weapon weapon = factory.createWeapon();
       Vehicle vehicle = factory.createVehicle();
       food.eat();
       weapon.use();
       vehicle.drive();
       
       factory = new AncientFactory();
       food = factory.createFood();
       weapon = factory.createWeapon();
       vehicle = factory.createVehicle();
       food.eat();
       weapon.use();
       vehicle.drive();
       
	}
}
