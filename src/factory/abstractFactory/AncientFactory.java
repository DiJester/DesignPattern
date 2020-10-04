package factory.abstractFactory;

import factory.factoryProduct.Carriage;
import factory.factoryProduct.Food;
import factory.factoryProduct.Mushroom;
import factory.factoryProduct.Sword;
import factory.factoryProduct.Vehicle;
import factory.factoryProduct.Weapon;

public class AncientFactory extends AbstractFactory{

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		
		return new Mushroom();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Carriage();
	}

}
