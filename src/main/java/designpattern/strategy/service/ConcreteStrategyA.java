package designpattern.strategy.service;

import designpattern.strategy.Strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("策略A的具体算法实现");
	}

}
