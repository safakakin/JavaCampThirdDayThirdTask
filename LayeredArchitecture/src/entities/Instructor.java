package entities;

public class Instructor {
	
	
	
	public Instructor(int instructorId, String name, String surname) {
		this.instructorId = instructorId;
		this.name = name;
		this.surname = surname;
	}
	private int instructorId;
	private String name;
	private String surname;
	
	public int getInstructorId() {return instructorId;}
	public void setInstructorId(int instructorId) {this.instructorId = instructorId;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	

}
