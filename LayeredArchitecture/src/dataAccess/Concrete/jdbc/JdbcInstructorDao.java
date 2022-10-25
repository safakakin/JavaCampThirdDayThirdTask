package dataAccess.Concrete.jdbc;

import dataAccess.Abstract.IInstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" instructor added to database by using Jdbc");
		
	}

}
