public class Main {
    public static void main(String[] args) {

        Fila f1 = new Fila(3);
        Fila f2 = new Fila(3);
        EX02 filamista = new EX02(10);
        f1.insere(1);
        f1.insere(2);
        f1.insere(3);
        f2.insere(4);
        f2.insere(5);
        f2.insere(6);

        filamista.combinaFilas(f1,f2);







    }
}