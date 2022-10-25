import java.util.ArrayList;
import java.util.List;

import business.Concrete.CategoryManager;
import business.Concrete.CourseManager;
import business.Concrete.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import dataAccess.Concrete.Hibernate.HibernateCategoryDao;
import dataAccess.Concrete.Hibernate.HibernateInstructorDao;
import dataAccess.Concrete.jdbc.JdbcCourseDao;
import dataAccess.Concrete.jdbc.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class program {

	public static void main(String[] args) throws Exception {
		List<ILogger> loggers = new ArrayList<ILogger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        Instructor instructor = new Instructor(1,"Şafak","Akın");
      
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);

        InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager1.add(instructor);

        List<Course> courses = new ArrayList<>();

        Course course = new Course(1,"Java",10);
      

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
        courseManager.add(course);

        List<Category> categories = new ArrayList<>();

        Category category = new Category(1,"oop");
      

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories, loggers);
        categoryManager.add(category);

	}

}
