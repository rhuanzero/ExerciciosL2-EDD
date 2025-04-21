/*1) Sabe-se que existem partes de sistemas operacionais que cuidam da ordem em que os
processos devem ser executados. Por exemplo, em um sistema de computação “timeshared”, existe a necessidade de manter um conjunto de processos em uma fila. Realize uma
modelagem e crie classes que representam um Processo e o Sistema Operacional. Dessa
maneira, escreva métodos para:
a. Incluir novos processos em uma fila de processos;
b. Retirar da fila o processo com o maior tempo de espera;
c. Imprimir o conteúdo da fila de processos em determinado momento. Cada processo possui
um número identificador.*/



public class EX01 {
    public static void main(String[] args) {

        Fila f1 = new Fila(5);
        FilaDupla filadupla1 = new FilaDupla(5);

        for (int i = 1; i <= 5; i++) {
            f1.insere(i);
        }


        while (!f1.vazia()){
            System.out.println(f1.remove());
        };
    }
}