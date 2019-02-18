package designpattern.isp.two.login;

public interface IQQAuthenticationProvider extends IThirdpartyAuthenticationProvider {

	// 获取qq的API数据
	String GetDataFromAPI(String url, String token);
}
