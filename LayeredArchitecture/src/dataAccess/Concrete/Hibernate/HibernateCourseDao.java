package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.ICourseDao;
import entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName()+" course added to database by using Hibernate");
		
	}

}
