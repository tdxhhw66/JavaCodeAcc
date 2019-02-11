package designpattern.strategy;

import designpattern.strategy.service.ConcreteStrategyA;
import designpattern.strategy.service.ConcreteStrategyB;
import designpattern.strategy.service.ConcreteStrategyC;

/**
 * 上下文
 * 
 * @author liu yuning
 *
 */
public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy) {

		this.strategy = strategy;
	}

	/*public Context(String strategyString) {

		Strategy strategy = null;
		switch (strategyString) {
		case "A":
			strategy = new ConcreteStrategyA();
			break;
		case "B":
			strategy = new ConcreteStrategyB();
			break;
		case "C":
			strategy = new ConcreteStrategyC();
			break;
		}

		this.strategy = strategy;
	}*/

	/**
	 * 上下文接口
	 */
	public void contextInterface() {
		strategy.algorithmInterface();
	}

}