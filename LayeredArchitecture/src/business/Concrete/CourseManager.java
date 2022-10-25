package business.Concrete;

import java.util.List;

import business.Abstract.ICourseService;
import core.logging.ILogger;
import dataAccess.Abstract.ICourseDao;
import entities.Course;

public class CourseManager implements ICourseService{
	private final ICourseDao courseDao;
    private final List<Course> courses;
    private final List<ILogger> loggers;
    

	public CourseManager(ICourseDao courseDao, List<Course> courses, List<ILogger> loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}


	public void add(Course course) throws Exception{
		if (course.getCoursePrice() < 0) {
            System.out.println("The course fee cannot be less than 0");
            return;
        }
        for (Course c : courses) {
            if (course.getCourseName().equals(c.getCourseName())) {
                throw new Exception("More than one course with the same name cannot be added.");
            }
        }
        courseDao.add(course);
        courses.add(course);
        
        for (ILogger logger : loggers) {
            logger.log(course.getCourseName());
        }
		
	}

}
