package factory.abstractFactory;

import factory.factoryProduct.Food;
import factory.factoryProduct.Vehicle;
import factory.factoryProduct.Weapon;

public abstract class AbstractFactory {
	public abstract Food createFood();
    public abstract Weapon createWeapon();
    public abstract Vehicle createVehicle();
}
