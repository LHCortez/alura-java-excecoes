
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
			conexao.close();

		} catch (IllegalStateException ex) {
			System.out.println("Erro na conexão.");
		}
	}
}
