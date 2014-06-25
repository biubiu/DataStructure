package com.dataStructure.array;

public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName,String lastName,int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		int val = this.getFirstName().compareTo(o.getFirstName());
		if(val==0){
			val = this.getLastName().compareTo(o.getLastName());
			if(val == 0)
				val = this.getAge()-o.getAge();
		}
			return val;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}