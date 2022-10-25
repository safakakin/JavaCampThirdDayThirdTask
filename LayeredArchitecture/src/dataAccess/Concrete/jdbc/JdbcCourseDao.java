package dataAccess.Concrete.jdbc;

import dataAccess.Abstract.ICourseDao;
import entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName()+" course added to database by using Jdbc");
		
	}

}
