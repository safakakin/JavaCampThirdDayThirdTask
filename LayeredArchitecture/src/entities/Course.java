package entities;

public class Course {
	
	
	public Course(int courseId, String courseName, double coursePrice) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	private int courseId;
	private String courseName;
	private double coursePrice;
	public int getCourseId() {return courseId;}
	public void setCourseId(int courseId) {this.courseId = courseId;}
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;}
	public double getCoursePrice() {return coursePrice;}
	public void setCoursePrice(double coursePrice) {this.coursePrice = coursePrice;}
	

}
