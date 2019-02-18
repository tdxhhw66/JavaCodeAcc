package designpattern.factory.method.achievefactory;

import designpattern.factory.method.IFactory;
import designpattern.factory.simple.Operation;
import designpattern.factory.simple.OperationAdd;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {

		System.out.println("这里有一些复杂的数据组装");
		System.out.println("这里有一些数据调用");
		return new OperationAdd();
	}

}
