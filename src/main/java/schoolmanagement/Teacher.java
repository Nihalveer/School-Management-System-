package schoolmanagement;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher {
 @Id
private int id;
	private String Tname;
	private String Subject;
	private long Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	
}
