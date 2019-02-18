package designpattern.dip.two;

public class DatabaseLogger implements ILog {
	public void info(String infoText) {
		System.out.println("输出数据库Info：" + infoText);
	}

	public void debug(String debugText) {
		System.out.println("输出数据库Debug：" + debugText);
	}

	public void warn(String warmText) {
		System.out.println("输出数据库Warn：" + warmText);
	}

	public void error(String errorText, Exception exception) {
		System.out.println("输出数据库Error：" + errorText + "-" + exception.getMessage());
	}
}
