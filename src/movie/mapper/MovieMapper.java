package movie.mapper;

import java.util.List;

import movie.model.MemoryModel;
import movie.model.Model;

public interface MovieMapper{
	/**
	 * 添加学生信息的实体类对象
	 * @param movieModel
	 */
	public void addMovie(Model movieModel);
	/**
	 * 根据id删除一个电影的信息
	 * @param id
	 */
	public void delMovieById(int id);
	/** 修改电影的信息
	 * 
	 * @param movieModel
	 * @param id
	 */
	//public void updateMovie(@Param("aaa")Model movieModel,@Param("id")int id);
	public void updateMovie(Model movieModel);
	/**
	 * 根据id返回一个
	 * @param id
	 * @return 返回一个学生信息
	 */
	public Model findMovieById(int id);
	/**
	 * @param 查询所有电影信息
	 * @return 查询所有电影信息的集合
	 */
	public List<Model> findMovies();

	public void addMemory(MemoryModel memoryModel);
}
