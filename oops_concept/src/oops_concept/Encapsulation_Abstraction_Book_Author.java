package oops_concept;
class Author{
	private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
    	return name;
    }
    public String getEmail() {
    	return email;
    }
    public char getGender() {
    	return gender;
    }
    public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
    
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
    	return name; 
    	}
    public Author getAuthor() {
    	return author; 
    	}
    public double getPrice() {
    	return price; 
    	}
    public int getQtyInStock() {
    	return qtyInStock; 
    	}

    public void setPrice(double price) { 
    	this.price = price;
    	}
    public void setQtyInStock(int qtyInStock) {
    	this.qtyInStock = qtyInStock; 
    	}
    public String toString() {
        return "Book Name: " + name + "\nPrice: " + price +
               "\nQuantity: " + qtyInStock + "\n" + author.toString();
    }
}
public class Encapsulation_Abstraction_Book_Author {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Sai", "sai@email.com", 'M');
        Book book = new Book("2 States", author, 299.99, 150);
        System.out.println(book);

	}

}
