package designpattern.isp.one;

public interface IObject {

	void Connection(String connectionString);

	String ExcuteSql(String sql);

	// 获取第三方API数据
	String GetDataFromAPI(String url, String token);

	// qq登录接口
	String LoginWithQQ(String token);

	// 微博登录接口
	String LoginWithWeibo(String token);

	// 微信登录接口
	String LoginWithWeiXin(String token);

	// 新增登录接口········
}
