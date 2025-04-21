/*2) Para a implementação de fila de inteiros apresentada em sala de aula, faça:
Usando apenas os métodos disponíveis previamente na classe Fila, implemente um novo
método na classe Fila que receba outras duas filas f1 e f2 e transfira alternadamente os
elementos de f1 e f2 para a fila corrente (cujo método foi chamado). A seguir está ilustrado
um exemplo:
f1 = 1,2,3
f2 = 4,5,6
filaMista = 1,4,2,5,3,6
Note que, ao final desse método, as filas f1 e f2 deverão estar vazias e a fila para o qual o
método foi chamado deve conter todos os valores originalmente em f1 e f2 (inicialmente a fila
para a qual o método foi chamado pode ou não estar vazia). O método transfere, no máximo,
quantos elementos couberem na fila. Tal método deve obedecer ao seguinte protótipo:
public void combinaFilas(Fila f1, Fila f2);*/

public class EX02
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected int[] vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */

	public EX02(int tam)
	{
		tamanho = tam;
		vetor = new int[tamanho];
		ini = 0;
		n = 0;
	}
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}
	
	//Retiramos o elemento do início da fila
	public int remove()
	{
		int elemento = Integer.MIN_VALUE;
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(int elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetor[fim] = elemento;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}

	public void combinaFilas(Fila f1, Fila f2){

		while (!f1.vazia() && !f2.vazia() && this.cheia()) {
			if (!f1.vazia()) {
				this.insere(f1.remove());
			}
			if (!f2.vazia()) {
				this.insere(f2.remove());
			}
			if (this.cheia()) {return;}
		}
		while (!this.vazia()){
			System.out.println(this.remove());
		}

	}
}