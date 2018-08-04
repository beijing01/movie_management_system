package thread;

import org.apache.log4j.Logger;

//import org.springframework.beans.factory.annotation.Autowired;
import movie.mapper.MovieMapper;
import movie.model.MemoryModel;


public class MemThread extends Thread{
	//run和start是同步和异步的区别
	private static final Logger logger = Logger.getLogger(MemThread.class);
	//@Autowired
	//作用：每隔5秒将当前系统的使用内存打印到log4j磁盘和屏幕上
	MovieMapper moviemapper;
	@Override
	public void run()
	{
		try {
			synchronized(this)
			{
				Thread.sleep(5000);
				MemoryModel memoryModel = new MemoryModel();
				memoryModel.setMaxMemory((int)Runtime.getRuntime().maxMemory()/1024/1024);
				memoryModel.setTotalMemory((int)Runtime.getRuntime().totalMemory()/1024/1024);
				memoryModel.setFreeMemory((int)Runtime.getRuntime().freeMemory()/1024/1024);
				moviemapper.addMemory(memoryModel);
				logger.info("记录一次内存信息");	
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.error("ERROR",e);
		}
		
	}
	
	public MovieMapper getMovieMappper()
	{
		return moviemapper;
	}
	public void setMovieMapper()
	{
		 this.moviemapper = moviemapper;
	}
}