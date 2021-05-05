package ders3odev2;

public class Instructor extends User {

	private String courses;

	public Instructor()
	{
		
	}
	

	public Instructor(int id, String email, String password, String courses) {
		super(id, email, password);
		this.courses = courses;
	}


	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
}
