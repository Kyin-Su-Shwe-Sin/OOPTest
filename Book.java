package OOPTest;

public class Book extends Author{
	public String name;
	public double price;
	public int qty;
	public Book(String name, Author author, double price) {
		super(author.name, author.email, author.gender);
		this.name=name;
		this.price=price;
	}
	public Book(String name, Author author, double price, int qty) {
		super(author.name, author.email, author.gender);
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	public void showInformation() {
		System.out.println("Book Name : "+name+"\n Author Name : "+super.name+"\n Author Email : "
				+super.email+"\n Author Gender : "+super.gender+"\n Price : "+this.price+
				"\n Qty : "+this.qty);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("Aung Aung", "aung@gmail.com", "male");
		Book b1=new Book("Book1",a,5000);
		Book b2=new Book("Book2",a,5000,2);
		
		b1.showInformation();
		b2.showInformation();
	}

}
