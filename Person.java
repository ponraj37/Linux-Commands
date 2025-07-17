package test;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public static void main(String args[]) {
		
		Person p=new Person();
		
		p.setAge(25);
		p.setName("Ponraj");
		
		System.out.println("Person name is: "+p.getName()+"\nPerson age is: "+p.getage());
		
	}
	
}
