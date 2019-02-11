package designpattern.strategy.service;

import designpattern.strategy.Strategy;

public class ConcreteStrategyC implements Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("策略C的具体算法实现");
	}

}
