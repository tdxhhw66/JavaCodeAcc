package designpattern.dip.one;

public class LoggerTest {

	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.Info("This is a info text.");
		logger.Debug("This is a debug text.");
		logger.Warn("This is a warn text.");
		logger.Error("This is a error text", new Exception("This is a exception."));

	}
}
