package com.park.auto;

import com.highbeauty.sql.spring.builder.ABuilder;
/**
 *
* @ClassName: JxhCoderAuto
* @Description: TODO(数据库表字段自动生成bean、dao)
* @author 敬小虎
* @date 2015年3月5日 下午2:24:48
*
 */
public class JxhCoderAuto {
	public static void main(String[] args) throws Throwable {
		boolean src = true;
		boolean is_maven = true;
		String moduleName="";
		String pkg = "com.park.";
		String[] tablenames = {"wx_user_info","wx_after_sale","wx_evaluate","wx_goods","wx_goods_details"
				,"wx_goods_order"
				,"wx_goods_type","wx_user_address","request_params_log","china_area","wx_apply_cash"
		,"wx_recommend_user","wx_recommend_earnings"};
		String ip = "127.0.0.1";
		int port = 3306;
		String user = "root";
		String password = "root";
		String databaseName = "wechat";
		ABuilder.AutoCoder(is_maven,src,moduleName, pkg, tablenames, ip, port, user, password, databaseName);
	}

}
