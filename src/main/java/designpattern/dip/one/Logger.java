package designpattern.dip.one;

public class Logger {
	public void Info(String infoText) {
		System.out.println("输出控制台Info：" + infoText);
	}

	public void Debug(String debugText) {
		System.out.println("输出控制台Debug：" + debugText);
	}

	public void Warn(String warmText) {
		System.out.println("输出控制台Warn：" + warmText);
	}

	public void Error(String errorText, Exception exception) {
		System.out.println("输出控制台Error：" + errorText + "-" + exception.getMessage());
	}
}
