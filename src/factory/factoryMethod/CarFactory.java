package factory.factoryMethod;

import factory.factoryProduct.Car;

//������������ʵ�����ⶨ����������
//�����ڲ�Ʒά����չ�������²�Ʒֻ��
//�½�һ��������
public class CarFactory {

	public Car create() {
		System.out.println("A car is created.");//������Ʒ�������־
		return new Car();
	}
}
