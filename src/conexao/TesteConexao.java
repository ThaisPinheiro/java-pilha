package conexao;
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegarStateException ex)
//			System.out.println("Deu erro na conexao");
//		} finally { //opcional e sempre será executado com ou sem erro
//			System.out.println("Finally");
//			if(con != null) {
//				con.close();
//			}
//		}
	}

}
