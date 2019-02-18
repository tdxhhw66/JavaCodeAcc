package designpattern.isp.two;

public interface IThirdpartyAuthenticationProvider {

	// qq登录接口
	String LoginWithQQ(String token);

	// 微博登录接口
	String LoginWithWeibo(String token);

	// 微信登录接口
	String LoginWithWeiXin(String token);

	// 新增登录接口········
}
