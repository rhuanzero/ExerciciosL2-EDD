/*5) Dado um número inteiro N, faça um algoritmo eficiente que use fila para gerar todas asrepresentações
binárias dos números inteiros entre 1 e N. Por exemplo, dado um inteiro N = 16,
serão gerados os seguintes valores que correspondem às representações binárias de 1 até 16:

1 10 11 100 110 1000 1001 1010 1011 1100 1101 1110 1111 10000  */

public class EX05
{
	public static void converteBinario(int n){
		Fila fila = new Fila(n);

		if (n<1){
			return;
		}

		for (int i = 1; i <= n; i++){
			fila.insere(i);
		}

		for (int i = 1; i <= n; i++){
			System.out.println(Integer.toBinaryString(fila.remove()));
		}

	}
}