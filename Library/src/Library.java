import java.util.Scanner;

public class Library {
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
		
		System.out.print("Date of publication: ");
		int dateOfPublication= book.nextInt();
		
		System.out.print("Literary genre: ");
		String literaryGenre= book.nextLine();
		
		
	}
}
