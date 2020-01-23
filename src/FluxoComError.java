
public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	// O metodo2 fica chamando a si mesmo, no final, causando um
	// StackOverflowError!| StackOverflowError � um erro da m�quina virtual para
	// informar que a pilha de execu��o n�o tem mais mem�ria.

	public static void metodo2() {
		System.out.println("In�cio do metodo2");
		metodo2();
		System.out.println("Fim do metodo2");
	}

}
