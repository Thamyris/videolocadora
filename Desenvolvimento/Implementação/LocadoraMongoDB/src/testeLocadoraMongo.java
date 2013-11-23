import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;


public class testeLocadoraMongo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			MongoClient mongoCliente = new MongoClient(new ServerAddress("localhost",27017));
			DB database = mongoCliente.getDB("locadora");
			DBCollection collection = database.getCollection("Filme");
			DBCursor cur = collection.find();
			System.out.println("Valores: " + cur.next());
			//System.out.println("Nome: " + cur.next().get("nome")); com este get tras o valor especifico

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
