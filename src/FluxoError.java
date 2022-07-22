
public class FluxoError {
	public static void main(String[] args) {
		System.out.println("Inicio no main");
		try {
			metodo1();
		} catch(Exception ex) {
			String mensagem = ex.getMessage();
			System.out.println("Exception: " + mensagem);
			ex.printStackTrace();	
		}
		
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("2...");
		metodo2();
	}
}





