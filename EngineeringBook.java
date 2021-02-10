package oopsassignment1;

public class EngineeringBook extends Book{
	private String category;
	public EngineeringBook(int bookNo, String title, String author, float price)
	{
		super(bookNo, title, author, price);
		
	}

	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
