package designpattern.factory.method.achievefactory;

import designpattern.factory.method.IFactory;
import designpattern.factory.simple.Operation;
import designpattern.factory.simple.OperationSub;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
