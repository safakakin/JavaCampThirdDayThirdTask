package entities;

public class Category {
	
	public Category(int categoryId, String categorName) {
		this.categoryId = categoryId;
		this.categorName = categorName;
	}
	private int categoryId;
	private String categorName;
	public int getCategoryId() {return categoryId;}
	public void setCategoryId(int categoryId) {this.categoryId = categoryId;}
	public String getCategoryName() {return categorName;}
	public void setCategoryName(String categorName) {this.categorName = categorName;}

}
