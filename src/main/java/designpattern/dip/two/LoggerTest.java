package designpattern.dip.two;

public class LoggerTest {

	public static void main(String[] args) {

		ILog logger = new TextLogger();//正式项目中可以通过修改配置文件调用不同实现
		logger.info("This is a info text.");
		logger.debug("This is a debug text.");
		logger.warn("This is a warn text.");
		logger.error("This is a error text", new Exception("This is a exception."));

	}
}
