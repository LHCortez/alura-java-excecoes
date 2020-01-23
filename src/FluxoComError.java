
public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Início do main");
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
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	// O metodo2 fica chamando a si mesmo, no final, causando um
	// StackOverflowError!| StackOverflowError é um erro da máquina virtual para
	// informar que a pilha de execução não tem mais memória.

	public static void metodo2() {
		System.out.println("Início do metodo2");
		metodo2();
		System.out.println("Fim do metodo2");
	}

}
