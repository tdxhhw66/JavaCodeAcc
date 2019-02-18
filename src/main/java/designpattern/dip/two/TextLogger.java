package designpattern.dip.two;

public class TextLogger implements ILog {
	public void info(String infoText) {
		System.out.println("输出文件Info：" + infoText);
	}

	public void debug(String debugText) {
		System.out.println("输出文件Debug：" + debugText);
	}

	public void warn(String warmText) {
		System.out.println("输出文件Warn：" + warmText);
	}

	public void error(String errorText, Exception exception) {
		System.out.println("输出文件Error：" + errorText + "-" + exception.getMessage());
	}
}
