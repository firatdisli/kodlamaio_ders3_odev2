package ders3odev2;

public class UserManager {

	public void Add(User user) {
		System.out.println(user.getEmail()+ "kullan�c�s� eklendi");
	}
	public void Delete(User user) {
		System.out.println("silme yap�ld�");
	}
	public void Update(User user) {
		System.out.println("g�ncelleme yap�ld�");
	}
	public User Get() {
		User user=new User();
		return user;
	}
}
