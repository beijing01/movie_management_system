
/**
 * 获取session的工具类
 * @author liuhongyang
 *
 */
package util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SessionFactory {
	//SqlSessionFactorydui
	//获取session的工具类
	private static SqlSessionFactory sqlSessionFactory = null;
	
	public static SqlSessionFactory getSessionFactory() {
		String resource = "conf.xml";
		InputStream is = SessionFactory.class.getClassLoader()
				.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
				.build(is);
		return sessionFactory;
	}
}