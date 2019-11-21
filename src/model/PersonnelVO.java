package model;
//id       char(2) Unique not null,
//name     varchar2(30) not null,
//dept     varchar2(20) not null,
//position char(1),
//duty     varchar2(20),
//phone    varchar2(14)
public class PersonnelVO {
	private String id;
	private String name;
	private String dept;
	private String position;
	private String duty;
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
