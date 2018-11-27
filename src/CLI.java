import java.util.Scanner;


public class CLI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String menu = "1.- Estado de cada dispositivo \n" +
					"2.- Apagar dispositivo \n"+
					"3.- Encender dispositivo \n"+
					"4.- Poner en modo ahorro a dispositivo \n"+
					"5.- Total KWh de dispositivos estándar \n";
		
		System.out.println("CLI SGE");
		System.out.println("Bienvenido, ingrese su username y password");
		System.out.println("username:");
		String user = scanner.nextLine();
		System.out.println("password:");
		String pwd = scanner.nextLine();
		System.out.println("Bienvenido, ingrese su username y password");
		
		System.out.println(menu);
	    
	    int choice = scanner.nextInt();

	    switch (choice) {
	        case 1:
	            // Perform "original number" case.
	            break;
	        case 2:
	            // Perform "encrypt number" case.
	            break;
	        case 3:
	            // Perform "decrypt number" case.
	            break;
	        case 4:
	            // Perform "quit" case.
	            break;
	        default:
	            // The user input an unexpected choice.
	    }

	}

}
