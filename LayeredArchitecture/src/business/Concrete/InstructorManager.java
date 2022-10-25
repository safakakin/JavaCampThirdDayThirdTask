package business.Concrete;

import java.util.List;

import business.Abstract.IInstructorService;
import entities.Instructor;
import core.logging.ILogger;
import dataAccess.Abstract.IInstructorDao;

public class InstructorManager implements IInstructorService{
	
	
	private final IInstructorDao instructorDao;
    private final List<ILogger> loggers;
    

	public InstructorManager(IInstructorDao instructorDao, List<ILogger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}


	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getName()+" "+instructor.getSurname());
		}
	}

}
