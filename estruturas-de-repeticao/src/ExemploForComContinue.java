
public class ExemploForComContinue {

	public static void main(String[] args) {
		
		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3)// aqui não imprime o valor 3 e continua a contar
				continue;

			System.out.println(numero);

		}

	}

}
