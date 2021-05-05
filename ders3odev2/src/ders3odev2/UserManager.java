package ders3odev2;

public class UserManager {

	public void Add(User user) {
		System.out.println(user.getEmail()+ "kullanýcýsý eklendi");
	}
	public void Delete(User user) {
		System.out.println("silme yapýldý");
	}
	public void Update(User user) {
		System.out.println("güncelleme yapýldý");
	}
	public User Get() {
		User user=new User();
		return user;
	}
}
