package business.Concrete;

import java.util.List;

import business.Abstract.ICategoryService;
import core.logging.ILogger;
import dataAccess.Abstract.ICategoryDao;
import entities.Category;

public class CategoryManager implements ICategoryService{
	
	private final ICategoryDao categoryDao;
    private final List<Category> categories;
    private final List<ILogger> loggers;
    

	public CategoryManager(ICategoryDao categoryDao, List<Category> categories, List<ILogger> loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception{
		for (Category c : categories) {
            if (category.getCategoryName().equals(c.getCategoryName())) {
                throw new Exception("More than one category with the same name cannot be added.");
            }
        }
        
		categoryDao.add(category);
        
        categories.add(category);

        for (ILogger logger : loggers) {
            logger.log(category.getCategoryName());
        }
		
	}

}
