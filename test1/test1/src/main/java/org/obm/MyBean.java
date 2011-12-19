package org.obm;

public class MyBean {

	private String name;
	private String address;
	private Integer age;
	private String genre;

	public MyBean() {
		super();
	}

	
	public MyBean(String name, String address, Integer age, String genre) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.genre = genre;
	}

	public MyBean(String name, String address, String genre) {
		this(name, address, null, genre);
	}
	
	public MyBean(MyBean bean) {
		this(bean.name, bean.address, bean.age, bean.genre);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s) died at %d", getName(), getAddress(), getAge()); 
	}
}
