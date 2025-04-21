/*3) Como você implementaria uma fila de pilhas? E uma pilha de filas? E uma fila de filas?
Implemente cada uma dessas estruturas. Você pode reaproveitar ou modificar as classes
fornecidas e apresentadas em sala de aula.*/

import java.util.Vector;

public class FilaGenericaEX03<T> // Utilizado para formar uma fila de pilhas e uma fila de filas
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected Vector<T> vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */

	public FilaGenericaEX03(int tam)
	{
		tamanho = tam;
		vetor = new Vector<T>(tamanho);
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
	public T remove()
	{
		T elemento = null;
		
		if (!this.vazia())
		{
			elemento = vetor.get(ini);
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(T elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
		vetor.add(fim, elemento);
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
}