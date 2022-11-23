import java.util.Scanner;

public class switchstate {
		public static void main(String[] variables) {
			Scanner clavier = new Scanner(System.in);
			int jour;
			System.out.println("saisir le numero de jour : ");
			jour = clavier.nextInt();
			
			switch (jour) {
			case 1:
				System.out.println("Lundi");
				break;
			case 2: 
				System.out.println("Mardi");
				break;
			case 3:
				System.out.println("Marcredi");
				break;
			case 4:
				System.out.println("Jeudi");
				break;
			case 5:
				System.out.println("Vendredi");
				break;
			case 6:
				System.out.println("Samedi");
				break;
			case 7:
				System.out.println("Dimanche");
				break;
			default:
				System.out.println("Entree invalide! Veuillez saisir le numero de jour 1 et 7.");
				
			
			}
	}
	
	
}
