package schoolmanagement;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Principle {
	
	private String pname;
	private int age;
	@Id
	private String email;
	private String password;
	private long mobile;

	public String getName() {
		return pname;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	

}
