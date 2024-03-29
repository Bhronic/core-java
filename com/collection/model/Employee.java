package com.collection.model;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private String city;

	public Employee() {
	}

	public Employee(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (id == o.id)
			return 0;
		else if (id > o.id)
			return -1;
		else
			return 1;
	}

}
