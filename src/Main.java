public class Main {
    public static void main(String[] args) {
        //EX02
        /*Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        EX02 filamista = new EX02(10);
        f1.insere(1);
        f1.insere(2);
        f1.insere(3);
        f2.insere(4);
        f2.insere(5);
        f2.insere(6);

        filamista.combinaFilas(f1,f2);*/

        //EX 03
        /*Pilha p = new Pilha();
        Pilha p2 = new Pilha();
        Pilha p3 = new Pilha();
        Pilha p4 = new Pilha();
        Pilha p5 = new Pilha();

        FilaGenerica<Pilha> filapilha = new FilaGenerica<>(5);

        p.push('c'); p.push('d'); p.push('e'); p.push('f'); p.push('g');
        p2.push('c'); p2.push('d'); p2.push('e'); p2.push('f'); p2.push('g');
        p3.push('c'); p3.push('d'); p3.push('e'); p3.push('f'); p3.push('g');
        p4.push('c'); p4.push('d'); p4.push('e'); p4.push('f'); p4.push('g');
        p5.push('c'); p5.push('d'); p5.push('e'); p5.push('f'); p5.push('g');

        filapilha.insere(p);
        filapilha.insere(p2);
        filapilha.insere(p3);
        filapilha.insere(p4);
        filapilha.insere(p5);

        while (!filapilha.vazia()){
            Pilha pilha = filapilha.remove();

            while (!pilha.vazia()){
                System.out.print(pilha.pop());;
            }
            System.out.println();
        }


*/


        //EX03
        /*Scanner in = new Scanner(System.in);
		// Fila de Pilhas
		Pilha p = new Pilha();
		Pilha p2 = new Pilha();
		Pilha p3 = new Pilha();
		Pilha p4 = new Pilha();
		Pilha p5 = new Pilha();

		FilaGenerica<Pilha> filapilha = new FilaGenerica<>(5);

		p.push('c'); p.push('d'); p.push('e'); p.push('f'); p.push('g');
		p2.push('c'); p2.push('d'); p2.push('e'); p2.push('f'); p2.push('g');
		p3.push('c'); p3.push('d'); p3.push('e'); p3.push('f'); p3.push('g');
		p4.push('c'); p4.push('d'); p4.push('e'); p4.push('f'); p4.push('g');
		p5.push('c'); p5.push('d'); p5.push('e'); p5.push('f'); p5.push('g');

		filapilha.insere(p);
		filapilha.insere(p2);
		filapilha.insere(p3);
		filapilha.insere(p4);
		filapilha.insere(p5);

		while (!filapilha.vazia()){
			Pilha pilha = filapilha.remove();

			while (!pilha.vazia()){
				System.out.print(pilha.pop());;
			}
			System.out.println();
		}

		// Pilha de Filas
		PilhaGenerica<Fila> pilhafila = new PilhaGenerica<>(10);

		Fila f1 = new Fila(5);
		Fila f2 = new Fila(5);
		Fila f3 = new Fila(5);
		Fila f4 = new Fila(5);
		Fila f5 = new Fila(5);

		f1.insere(1); f1.insere(2); f1.insere(3); f1.insere(4); f1.insere(5);
		f2.insere(1); f2.insere(2); f2.insere(3); f2.insere(4); f2.insere(5);
		f3.insere(1); f3.insere(2); f3.insere(3); f3.insere(4); f3.insere(5);
		f4.insere(1); f4.insere(2); f4.insere(3); f4.insere(4); f4.insere(5);
		f5.insere(1); f5.insere(2); f5.insere(3); f5.insere(4); f5.insere(5);

		pilhafila.push(f1);
		pilhafila.push(f2);
		pilhafila.push(f3);
		pilhafila.push(f4);
		pilhafila.push(f5);

		while (!pilhafila.vazia()){
			Fila fila1 = pilhafila.pop();
			while (!fila1.vazia()){
				System.out.print(fila1.remove());;
			}
			System.out.println();
		}

		//Fila de filas
		FilaGenerica<Fila> filafila = new FilaGenerica<>(10);

		f1.insere(1); f1.insere(2); f1.insere(3); f1.insere(4); f1.insere(5);
		f2.insere(1); f2.insere(2); f2.insere(3); f2.insere(4); f2.insere(5);
		f3.insere(1); f3.insere(2); f3.insere(3); f3.insere(4); f3.insere(5);
		f4.insere(1); f4.insere(2); f4.insere(3); f4.insere(4); f4.insere(5);
		f5.insere(1); f5.insere(2); f5.insere(3); f5.insere(4); f5.insere(5);

		filafila.insere(f1);
		filafila.insere(f2);
		filafila.insere(f3);
		filafila.insere(f4);
		filafila.insere(f5);
		System.out.println("Filafila:");
		while (!filafila.vazia()){
			Fila fila1 = filafila.remove();
			while (!fila1.vazia()){
				System.out.print(fila1.remove());;
			}
			System.out.println();
		}*/
        /*Fila fteste = new Fila(10);

        for (int i = 0; i < 10; i++) {
            fteste.insere(i);
        }*/
        EX05.converteBinario(16);

    }
}