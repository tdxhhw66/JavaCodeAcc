package designpattern.factory.method.achievefactory;

import designpattern.factory.method.IFactory;
import designpattern.factory.simple.Operation;
import designpattern.factory.simple.OperationDiv;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
