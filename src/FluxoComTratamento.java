
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();

			// MULTI-CATCH usando o pipe (|):
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();

		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
//		try {
//			metodo2();
//		} catch (ArithmeticException ex) {
//			System.out.println("ArithmeticException");
//		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
//		ArithmeticException exception = new ArithmeticException();
//		throw exception;
		throw new ArithmeticException("Deu ruim.");

	}
}
