package factory.factoryMethod;

import factory.factoryProduct.Car;

//工厂方法可以实现任意定义生产过程
//易于在产品维度扩展，生产新产品只需
//新建一个工厂类
public class CarFactory {

	public Car create() {
		System.out.println("A car is created.");//生产产品后产生日志
		return new Car();
	}
}
