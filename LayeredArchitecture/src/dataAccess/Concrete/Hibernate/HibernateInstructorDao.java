package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.IInstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" instructor added to database by using Hibernate");
	}

}
