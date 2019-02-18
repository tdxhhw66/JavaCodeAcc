package designpattern.dip.two;

public class ConsoleLogger implements ILog {
	public void info(String infoText) {
		System.out.println("输出控制台Info：" + infoText);
	}

	public void debug(String debugText) {
		System.out.println("输出控制台Debug：" + debugText);
	}

	public void warn(String warmText) {
		System.out.println("输出控制台Warn：" + warmText);
	}

	public void error(String errorText, Exception exception) {
		System.out.println("输出控制台Error：" + errorText + "-" + exception.getMessage());
	}
}
