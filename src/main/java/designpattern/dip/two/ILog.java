package designpattern.dip.two;

public interface ILog {

	void info(String infoText);

	void debug(String debugText);

	void warn(String warmText);

	void error(String errorText, Exception exception);
}
