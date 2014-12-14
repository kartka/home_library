import java.util.Scanner;

public class Book {
	
	String title;
	String authorsName;
	String authorsSurname;
	String publishingHouse;
	String literaryGenre; 
	int dateOfPublication; 
	
	public Book(String t, String aN, String aS, String pH, String lG, int dOP) {
		
		title = t;
		authorsName = aN;
		authorsSurname = aS;
		publishingHouse= pH;
		literaryGenre= lG; 
		dateOfPublication= dOP; 
		
	}
	
	public static void main(String[] args){
		Scanner take = new Scanner(System.in);
		
		System.out.print("Title: ");
		String title= take.nextLine();

		System.out.print("Author's name: ");
		String authorsName= take.nextLine();
		
		System.out.print("Author's surname: ");
		String authorsSurname= take.nextLine();
		
		System.out.print("Publishing house: ");
		String publishingHouse= take.nextLine();
		
		System.out.print("Literary genre: ");
		String literaryGenre= take.nextLine();
		
		System.out.print("Date of publication: ");
		int dateOfPublication= take.nextLine();
		
		Book book = new Book(title, authorsName, authorsSurname, publishingHouse, literaryGenre, dateOfPublication);
		
		System.out.println("\n"+ "Title: "+ title + "\n" + "Author's name: " + authorsName + "\n" + "Author's surname: " + authorsSurname + "\n" + "Publishing house: " + publishingHouse + "\n" + "Literary genre: " + literaryGenre + "\n"+ "Date of publication: " + dateOfPublication);
		
		take.close();	
	}
	
}

