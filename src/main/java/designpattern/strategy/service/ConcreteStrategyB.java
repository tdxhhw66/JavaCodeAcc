package designpattern.strategy.service;

import designpattern.strategy.Strategy;

public class ConcreteStrategyB implements Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("策略B的具体算法实现");
	}

}
