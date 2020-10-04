package factory.abstractFactory;

import factory.factoryProduct.AssaultRifle;
import factory.factoryProduct.Bread;
import factory.factoryProduct.Food;
import factory.factoryProduct.Motorcycle;
import factory.factoryProduct.Vehicle;
import factory.factoryProduct.Weapon;

public class ModernFactory extends AbstractFactory {

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		
		return new Bread();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new AssaultRifle();
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Motorcycle();
	}
	

}
