package threads;

public class ProdutorConsumidor extends Thread {

	private int conteudoBox;
	private boolean conteudo = false; 
	
	public synchronized int get() {
		while(conteudo == false){
			try{
				//espera até que o produtor coloque um valor !!
				wait();
			}catch(InterruptedException e){
			}
		}
		conteudo = false; // caixa foi esvaziada;
		System.out.println("caixa foi esvaziada com menos: "+conteudoBox + " produtos");
		notifyAll();
		return conteudoBox;
	}
	
	public synchronized void put (int valor) {
		while (conteudo==true){
			try{
				//esperar até que o consumidor esvazie a caixa
				wait();
			}catch(InterruptedException e){
				
			}
		}
		conteudoBox = valor;
		conteudo = true;
		// informa que o novo valor foi inserido
		System.out.println("caixa cheixa!!");
		notifyAll();
	}
}
