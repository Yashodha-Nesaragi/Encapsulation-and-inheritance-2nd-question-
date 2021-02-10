package oopsassignment1;

public class BookDetails {

	public BookDetails(int bookNo, String title, String author, float price) {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 EngineeringBook eb = new EngineeringBook(122,"The Haunted Ship","Yashas Singh",6098);
		  eb.setCategory("Horror Story");
		  
		  eb.DisplayBook();
		  System.out.println(eb.getCategory());

	}

}
