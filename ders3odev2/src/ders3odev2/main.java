package ders3odev2;

public class main {

	public static void main(String[] args) {
		
		Student student=new Student();
		Instructor instructor=new Instructor();
		
		student.setId(1);
		student.setEmail("a@gmail.com");
		student.setPassword("12345");
		student.setCourses("c#");
		student.setCourseProggres("tamamlandı");
		
		instructor.setId(2);
		instructor.setEmail("e@gmail.com");
		instructor.setPassword("98765");
		instructor.setCourses("c#");
		
		Student student2=new Student(3, "ucuncu@gmail.com","123123", "asp.net", "devam ediyor");
		Instructor instructor2=new Instructor(4,"dorduncu@gmail.com","789789","asp.net");
		
		System.out.println(instructor.getEmail()+" "+instructor.getCourses());
		System.out.println(student.getEmail()+" "+student.getCourses()+" "+student.getCourseProggres());
		
		System.out.println(instructor2.getEmail());
		System.out.println(student2.getEmail());
		
		//User dizisi ile yazdırma
		User[] users= {student,student2,instructor,instructor2};
		
		for(User user:users) {
			System.out.println(user.getEmail());
		}
		
		StudentManager stm=new StudentManager();
		stm.Add(student);
		
		InstructorManager insm=new InstructorManager();
		insm.Add(instructor2);
		}
	
	
	
	

}
