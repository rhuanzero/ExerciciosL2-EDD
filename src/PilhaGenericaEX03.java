/*3) Como você implementaria uma fila de pilhas? E uma pilha de filas? E uma fila de filas?
Implemente cada uma dessas estruturas. Você pode reaproveitar ou modificar as classes
fornecidas e apresentadas em sala de aula.*/
import java.util.Vector;

public class PilhaGenericaEX03<T> // Utilizado para formar uma Pilha de filas
{
	private int n;
	private Vector<T> vetor;
	private int topo;

	public PilhaGenericaEX03()
	{
		n = 10;
		vetor = new Vector<T>(10);
		topo = -1;
	}


	public PilhaGenericaEX03(int tamanho)
	{		
		n = tamanho;
		vetor = new Vector<T>(tamanho);
		topo = -1;
	}

	public boolean vazia()
	{
		return topo == -1 ? true : false; 
	}
	
	public boolean cheia()
	{
		return topo == n - 1 ? true : false;
	}
	
	public T pop()
	{
		T elemento;
		
		if (!this.vazia())
		{
			elemento = vetor.get(topo--);
			return elemento;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha vazia: pop nao funcionou.");
			return null;
		}
	}
	
	public boolean push(T elemento)
	{
		if (!this.cheia())
		{
			vetor.add(++topo, elemento);
			return true;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha cheia: push nao funcionou.\n");
			return false;
		}
	}
	
	public boolean retornaTopo(T elemento)
	{
	     if(!this.vazia()){
	        elemento = vetor.get(topo);         
	        return true;
	     }
	     else
	    	 return false;
	}
}