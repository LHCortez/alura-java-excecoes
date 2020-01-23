
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();

			// MULTI-CATCH usando o pipe (|):
			//catch (ArithmeticException | NullPointerException | MyException ex) Vs. catch gen�rico abaixo:
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();

		}
		System.out.println("Fim do main");
	}

	// Em exce��es que extendem diretamente da classe Exception � necess�rio lan�ar
	// a nossa exce��o na assinatura do m�todo.| No caso das que extendem da
	// RunTimeException, p.e., n�o.
	private static void metodo1() throws MyException {
		System.out.println("Ini do metodo1");
		metodo2();
//		try {
//			metodo2();
//		} catch (ArithmeticException ex) {
//			System.out.println("ArithmeticException");
//		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MyException {
		System.out.println("Ini do metodo2");
		throw new MyException("Deu muito ruim!");
		// System.out.println("Fim do metodo2");

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			Conta c = null;
//			c.deposita();
//			// int a = i / 0;
////			try {
////				int a = i / 0;
////			} catch (ArithmeticException ex) {
////				System.out.println("ArithmeticException");
////			}

	}

}
