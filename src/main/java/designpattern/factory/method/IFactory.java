package designpattern.factory.method;

import designpattern.factory.simple.Operation;

/**
 * 工厂接口
 * 
 * @author liu yuning
 *
 */
public interface IFactory {
	public Operation createOperation();
}
