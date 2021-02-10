package oopsassignment1;

public class Book {
	private  int bookNo;
	private String title;
	private String author;
	private float price;
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	  void DisplayBook() 
	  { 
		  System.out.println("Book number is: "+bookNo); 
		  System.out.println("Book title is:"+title); 
		  System.out.println("The author of the book is: "+author); 
		  System.out.println("The price of the book is:"+price); 

	 }
	
	

}
