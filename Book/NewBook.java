import java.util.Scanner;

public class Book {
	public static void main(String[] args){
		Scanner book = new Scanner(System.in);
		
		System.out.print("Title: ");
		String title= book.nextLine();

		System.out.print("Author's name: ");
		String authorsName= book.nextLine();
		
		System.out.print("Author's surname: ");
		String authorsSurname= book.nextLine();
		
		System.out.print("Publishing house: ");
		String publishingHouse= book.nextLine();
		
		System.out.print("Literary genre: ");
		String literaryGenre= book.nextLine();
		
		System.out.print("Date of publication: ");
		String dateOfPublication= book.nextLine();
		
		
		System.out.println("\n"+ "Title: "+ title + "\n" + "Author's name: " + authorsName + "\n" + "Author's surname: " + authorsSurname + "\n" + "Publishing house: " + publishingHouse + "\n" + "Literary genre: " + literaryGenre + "\n"+ "Date of publication: " + dateOfPublication);
			
	}
	
}

