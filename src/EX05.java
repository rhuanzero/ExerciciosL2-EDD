/*5) Dado um n�mero inteiro N, fa�a um algoritmo eficiente que use fila para gerar todas asrepresenta��es
bin�rias dos n�meros inteiros entre 1 e N. Por exemplo, dado um inteiro N = 16,
ser�o gerados os seguintes valores que correspondem �s representa��es bin�rias de 1 at� 16:

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