package dev.distasio.beans;

public class Dog implements Comparable<Dog>{

	public Integer id;
	public String name;
	public Integer age;
	
	
	public Dog(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Dog() {

	}
	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Dog o) {
		
		if (this.name != null && !this.name.equals(o.name)) {
			
			return this.name.compareTo(o.name);
		}
		
		if (this.age != o.age) { 
			
			return this.age - o.age;
		}
		
		return this.id - o.id;
	}
}
	
