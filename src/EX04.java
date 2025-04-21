/*Implemente um método estático na classe Fila, a qual implementa uma fila circular. Esse
método deve receber uma fila circular e retornar uma fila circular dupla.*/

public class EX04
{ //Classe Fila
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected int[] vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */

	public EX04(int tam)
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

	// Metodo estático pedido para o EX04
	public static FilaDupla filaparadupla(Fila fila){
		FilaDupla fdupla = new FilaDupla(fila.getTamanho()); // Inserido na classe Fila

		while (!fila.vazia()){
			fdupla.insere(fila.remove());
		}

		return fdupla;
	}


	public int getTamanho() {
		return tamanho;
	}
}