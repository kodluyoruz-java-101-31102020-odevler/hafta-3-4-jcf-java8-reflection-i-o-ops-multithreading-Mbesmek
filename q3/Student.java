package q3;

public class Student {
	
	public String name;
	public String surname;
	
	
	public Student(String name, String surname) {
		super();
		
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		StringBuilder builder =  new StringBuilder();
		builder.append("Name:"+ this.getName());
		builder.append(" ");
		builder.append("Surname: " +this.getSurname());
		
		return builder.toString();
		
		
	}
}
