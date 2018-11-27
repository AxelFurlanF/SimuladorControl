import java.util.Scanner;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class CLI {

	public static void main(String[] args) throws UnirestException {
		Scanner scanner = new Scanner(System.in);
		
		String menu = "1.- Estado de cada dispositivo \n" +
					"2.- Apagar dispositivo \n"+
					"3.- Encender dispositivo \n"+
					"4.- Poner en modo ahorro a dispositivo \n"+
					"5.- Total KWh de dispositivos estándar \n"+
					"6.- Salir";
		
		System.out.println("CLI SGE");
		System.out.println("Bienvenido, ingrese su username y password");
		System.out.println("username:");
		String user = scanner.nextLine();
		System.out.println("password:");
		String pwd = scanner.nextLine();
		
		/*
		
		//Validar usuario
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://localhost:9000/api/validateUser")
				  .header("accept", "application/json")
				  .field("username", user)
				  .field("password", pwd)
				  .asJson();
		
		*/
		
		
		System.out.println("Bienvenido, ingrese su username y password");
		
		
		Boolean in = true;
		while(in) {
			System.out.println(menu);
		    
		    int choice = scanner.nextInt();
	
		    switch (choice) {
		        case 1:
		    		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://localhost:9000/api/validateUser")
															  .header("accept", "application/json")
															  .field("username", user)
															  .field("password", pwd)
															  .asJson();
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
		        case 5:
		            // Perform "quit" case.
		            break;
		        default:
		        	in=false;
		            break;
		    }

		}
	}

}
