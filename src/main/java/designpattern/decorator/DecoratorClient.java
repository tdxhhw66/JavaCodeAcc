package designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 装饰模式客户端调用代码，装饰的过程更像是层层包装，用前面的对象装饰后面的对象
 * 
 * @author liu yuning
 *
 */
public class DecoratorClient {
	public static void main(String[] args) throws FileNotFoundException {
		ConcreteComponent concreteComponent = new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
		ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC();

		concreteDecoratorA.setComponent(concreteComponent);
		concreteDecoratorB.setComponent(concreteDecoratorA);
		concreteDecoratorC.setComponent(concreteDecoratorB);
		concreteDecoratorC.operation();

		InputStream inputStream = new FileInputStream("test.txt");
		InputStream bufferedInputStream = new BufferedInputStream(inputStream);
		
	}
}
