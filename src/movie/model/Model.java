package movie.model;

import javax.xml.crypto.Data;

/**
 * 本类作为学生成绩管理项目的实体类
 * 
 * @author liuhongyang
 *
 */
public class Model {
	/**
	 * 删除本行：ctrl+D 自动排版:ctrl+shift+F 自动导包 ctrl+shif+O 自动出现左边的定义alt+shift+l
	 * 移动光标alt+上下光标键 当前面板最大化-还原ctrl+M 统一更改变量名 alt+shift+r 调用轨迹 ctrl+alt+h
	 */

	/**
	 * 主键
	 */
	private int id;
	/**
	 * 电影名称
	 */
	private String movie;
	/**
	 * 电影类型
	 */
	private String genre;
	/**
	 * 
	 */
	private int critic;
	/**
	 * 
	 */
	private String director;
	/**
	 * 
	 */
	private String location;
	/**
	 * 
	 */
	private int douban;
	/**
	 * 
	 */
	private int tomatoes;
	/**
	 * 
	 */
	private int idmb;
	
	private Data data;
	public Model()
	{
		super();
	}
	public Model(String movie, String genre, int critic, String director, String location, int douban, int tomatoes, int idmb) {
		// TODO Auto-generated constructor stub
		super();
		this.movie = movie;
		this.genre = genre;
		this.critic = critic;
		this.director = director;
		this.location = location;
		this.douban = douban;
		this.idmb = idmb;
		this.tomatoes = tomatoes;
		
		
	}
	
	public Model(int douban, int tomatoes, int idmb)
	{
		super();
		this.douban = douban;
		this.tomatoes = tomatoes;
		this.idmb = idmb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getCritic() {
		return critic;
	}

	public void setCritic(int critic) {
		this.critic = critic;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDouban() {
		return douban;
	}

	public void setDouban(int douban) {
		this.douban = douban;
	}

	public int getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(int tomatoes) {
		this.tomatoes = tomatoes;
	}

	public int getIdmb() {
		return idmb;
	}

	public void setIdmb(int idmb) {
		this.idmb = idmb;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
