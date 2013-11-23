package threads;

public class TesteThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProdutorConsumidor p1  = new ProdutorConsumidor();
		p1.run();
		p1.start();
		p1.put(15);
		//p1.get();
	}

}
