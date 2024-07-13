
public class ResultadoEscolar2 {

	public static void main(String[] args) {

		int nota = 6;
		//estrutura condicional encadeada
		if (nota >= 7) {//teste de condição
			System.out.println("Aprovado");//imprime se o resultado do teste for verdadeiro
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Recuperação");//imprime se o resultado do teste for verdadeiro
		} else {
			System.out.println("Reprovado");// imprime se o resultado do teste for falso
		}
	}

}
