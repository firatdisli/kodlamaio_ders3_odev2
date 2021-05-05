package ders3odev2;

public class Student extends User{

	private String courses;
	private String courseProggres;
	
	public Student() {
		
	}
	public Student(int id, String email, String password, String courses, String courseProggres) {
		super(id, email, password);
		this.courses = courses;
		this.courseProggres = courseProggres;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getCourseProggres() {
		return courseProggres;
	}
	public void setCourseProggres(String courseProggres) {
		this.courseProggres = courseProggres;
	}
	
	
}
