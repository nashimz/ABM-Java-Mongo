package practicaTest;

import java.io.File;

import java.io.FileOutputStream;

import java.io.OutputStreamWriter;

import java.time.LocalDate;
import java.util.ArrayList;



import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import practica.Producto;
import practica.Ticket;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		ArrayList<Ticket> tick = new ArrayList<Ticket>();
		
		ArrayList<Producto> prod = new ArrayList<Producto>();
		
	    prod.add(new Producto("Farmaco","Ibuprofeno","Bayer",1234,500.50));
		prod.add(new Producto("Farmaco","Livotiroxina","Bayer",5678,600.50));
		prod.add(new Producto("Farmaco","Diclofenac","Pfizer",91011,1000.50));
		prod.add(new Producto("Farmaco","DBI","Pfizer",121314,5000.50));
		
		tick.add(new Ticket (LocalDate.of(2020, 01, 1),606060,600.00,"Debito","Pepe",2,"Martin Perez","Jose Miguel Galilea","Livotiroxina","Farmacia","OSDE","Raul Gimenez"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 5),555555,655.00,"Efectivo","Pepe",3,"Jorge Barrio","Jose Miguel Raulin","DBI","Farmacia","Privado","Esteban Quito"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 6),444444,611.00,"Credito","Fosforito",7,"Agustin Canapino","Jose Miguel Xelafon","Ibuprofeno","Farmacia","IOMA","Armando Paredes"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 7),333333,604.00,"Debito","Fosforito",15,"Nigel Mansell","Jose Miguel Galilea","Diclofenac","Farmacia","PAMI","Susana Oria"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 12),222222,545.00,"Debito","Fosforito",4,"Alain Prost","Jose Miguel Galilea","Shampoo", "Perfumeria","Privado","Lionel Messi"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 15),111111,767.00,"Efectivo","Sebita",77,"Lucas Trotta","Jose Miguel Galilea","Jabon Ala","Perfumeria","Accord Salud","Julian Alvarez"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 13),323232,123.00,"Debito","Sebita",4,"Sebastian Romano","Jose Miguel Galilea","Perfume ONE MILLION","Perfumeria","Swiss Medical","Ross Geller"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 22),434234,332.50,"Credito","Sebita",5,"Tupac Shakur","Jose Miguel Galilea","Rivotril","Farmacia","Privado","Monica Geller"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 23),777776,444.00,"Credito","Kenia",9,"Cristiano Ronaldo","Jose Miguel Galilea","Aspirineta Bayer", "Farmacia","PAMI","Chandler Bing"));
		tick.add(new Ticket (LocalDate.of(2020, 01, 25),656666,655.00,"Debito","Kenia",2,"Que seyo","Jose Miguel Galilea","DBI", "Farmacia","OSDE","Joey Tribianni"));
		
// CONVIERTO a JSON la lista de Ticket y genero un archivo
		Gson gson = new Gson();
		
		String json2 = gson.toJson(tick);
        
       try {
		File myFile = new File("datos.json");
        myFile.createNewFile();
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter =new OutputStreamWriter(fOut);
       
        myOutWriter.append(json2);
        
        
        myOutWriter.close();
        fOut.close(); 
		}
		catch (Exception e) { }
		
		
		
	
// CONEXION A MONGO
		try {
			//Conecto a MongoDB
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			//Conecto a la base de datos
			DB dbFarmacia = mongoClient.getDB("dbFarmacia");

			//Creo la coleccion
			DBCollection collectionProducto = dbFarmacia.getCollection("Producto");
			DBCollection collectionTicket = dbFarmacia.getCollection("Ticket");
			


			
			for (Ticket ticke : tick) {
				collectionTicket.insert(ticke.toDBObjectTicket());
			}
			
			for (Producto produ : prod) {
				collectionProducto.insert(produ.toDBObjectProducto());
			}
			
			
			
			
	} catch (Exception ex) {
			System.out.println("Exception al conectar al server de Mongo: " + ex.getMessage());
	}
		
		
		
		
		
		
	}

	
	 
	

}
