package movie;

import java.util.ArrayList;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;

import movie.mapper.MovieMapper;
import movie.model.Model;
import util.SessionFactory;

public class TestMovie {
	/**
	 * source folder是源码包，用于放置java文件，可自动编译
	 * src和test属于源码包，不算路径
	 * lib是普通的folder，放置jar包，不可编译
	 * movie以下是package
	 * 
	 */
	Logger logger;

	@Before
	public void getLogger() {
		try {
			DOMConfigurator.configure("src/log4j.xml");
			logger = Logger.getLogger(TestMovie.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void addMovie() {
		SqlSessionFactory sqlSessionFactory = SessionFactory.getSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		Model movieModel = new Model("王者无敌", "动作",932947, "莫腾森", "美国", 80, 96, 98);
		mapper.addMovie(movieModel);
		session.commit();
		session.close();
		logger.info("数据添加成功");

	}
	
	//@Test
	public void updateMovie()
	{
		SqlSessionFactory sqlSessionFactory = SessionFactory.getSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		Model model = mapper.findMovieById(3);
		model.setDouban(10);
		model.setIdmb(10);
		model.setTomatoes(20);
		
		mapper.updateMovie(model);
		session.commit();
		session.close();
		logger.info("数据更新成功");
	}
	
	
	//@Test
	public void delMovieById()
	{
		SqlSessionFactory sqlSessionFactory = SessionFactory.getSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		mapper.delMovieById(2);
		session.commit();
		session.close();
		logger.info("数据删除成功");
		
	}
	
	
	//@Test
	public void findMovieById()
	{
		SqlSessionFactory sqlSessionFactory = SessionFactory.getSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		mapper.findMovieById(3);
		session.commit();
		session.close();
		logger.info("数据查询成功");
	}
	//代码，last_insert_id,

	@Test
	public void findStudents()
	{
		SqlSessionFactory sqlSessionFactory = SessionFactory.getSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		Model model = new Model();
		mapper.findMovies();
		
		session.commit();
		session.close();
		logger.info("数据列表返回成功");
	}
	
}
