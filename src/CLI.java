import java.util.Scanner;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;


public class CLI {

	public static void main(String[] args) throws UnirestException {
		Scanner scanner = new Scanner(System.in);
		
		String menu = "1.- Listado de dispositivo \n" +
					"2.- Apagar dispositivo \n"+
					"3.- Encender dispositivo \n"+
					"4.- Poner en modo ahorro a dispositivo \n"+
					"5.- Consumo último mes \n"+
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
		
		int id_user = 2;
		
		
		
		Boolean in = true;
		while(in) {
			System.out.println(menu);
		    
		    int choice = scanner.nextInt();
		    scanner.nextLine();
	
		    switch (choice) {
		        case 1:
		    		GetRequest jsonResponse = Unirest.get("http://localhost:9000/api/dispositivos/"+id_user);
		    		System.out.println(jsonResponse.asString().getBody());
		            break;
		        case 2:
		    		System.out.println("Que dispositivo desea apagar? ID:");
		    		String id_dispo = scanner.nextLine();
		    		GetRequest statusResponse = Unirest.get("http://localhost:9000/api/apagar_dispositivo/" + id_user + "/" +id_dispo);
		    		System.out.println(statusResponse.asString().getBody());
		        	break;
		        case 3:
		        	System.out.println("Que dispositivo desea encender? ID:");
		    		String id_dispo_e = scanner.nextLine();
		    		GetRequest statusResponse_e = Unirest.get("http://localhost:9000/api/encender_dispositivo/" + id_user + "/" +id_dispo_e);
		    		System.out.println(statusResponse_e.asString().getBody());
		        	break;
		        case 4:
		        	System.out.println("Que dispositivo desea poner en modo de ahorro? ID:");
		    		String id_dispo_a = scanner.nextLine();
		    		GetRequest statusResponse_a = Unirest.get("http://localhost:9000/api/ahorro_dispositivo/" + id_user + "/" +id_dispo_a);
		    		System.out.println(statusResponse_a.asString().getBody());
		        	break;
		        case 5:
		        	System.out.println("Que dispositivo desea poner en modo de ahorro? ID:");
		    		GetRequest statusResponse_c = Unirest.get("http://localhost:9000/api/consumo_ultimo_mes/" + id_user);
		    		System.out.println(statusResponse_c.asString().getBody());
		        default:
		        	in=false;
		            break;
		    }
		    
		    System.out.println("\n \n \n");
		}
	}

}
