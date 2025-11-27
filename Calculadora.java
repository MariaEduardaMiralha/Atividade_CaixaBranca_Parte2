package calculadora;

public class Calculadora {
	
	public int r = 0;
	
	public int calc(int a, int b, String op) {
		
		//Calculadora
		if(op.equals("+")) {
			r = a + b;
		} else if(op.equals("-")) {
			r = a - b;
		} else if(op.equals("*")) {
			r = a * b;
		} else if(op.equals("/")) {
			if (b != 0) {
				r = a / b;
			} else {
				System.out.println("Erro: divisão por zero, operação irregular");
				r = 0;
			}
		} else {
			System.out.println("operação invalida");
			r = 0;
		}

		System.out.println("resultado = " + r);
		return r;
	}
}