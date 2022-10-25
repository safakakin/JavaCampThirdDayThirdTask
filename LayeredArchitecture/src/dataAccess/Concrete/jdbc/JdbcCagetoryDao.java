package dataAccess.Concrete.jdbc;

import dataAccess.Abstract.ICategoryDao;
import entities.Category;

public class JdbcCagetoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName()+" category added to database by using Jdbc");
		
	}

}
