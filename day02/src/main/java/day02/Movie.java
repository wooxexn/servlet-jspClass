package day02;

public class Movie {
	
	String name;
	String runnigtime;
	String actor;
	
	public Movie(String name, String runnigtime, String actor) {
		super();
		this.name = name;
		this.runnigtime = runnigtime;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRunnigtime() {
		return runnigtime;
	}

	public void setRunnigtime(String runnigtime) {
		this.runnigtime = runnigtime;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	
	
	

}
