/*1) Sabe-se que existem partes de sistemas operacionais que cuidam da ordem em que os
processos devem ser executados. Por exemplo, em um sistema de computação “timeshared”, existe a necessidade de manter um conjunto de processos em uma fila. Realize uma
modelagem e crie classes que representam um Processo e o Sistema Operacional. Dessa
maneira, escreva métodos para:
a. Incluir novos processos em uma fila de processos;
b. Retirar da fila o processo com o maior tempo de espera;
c. Imprimir o conteúdo da fila de processos em determinado momento. Cada processo possui
um número identificador.*/

public class SOEX01 {
    private Fila processos;

    public SOEX01(int tamanho) {
        processos = new Fila(tamanho);
    }

    public boolean incluirProcesso(ProcessoEX01 processo) { // a. Incluir novos processos em uma fila de processos;
        return processos.insere(processo.getId());
    }

    public int retirarProcesso() { // b. Retirar da fila o processo com o maior tempo de espera;
        return processos.remove();
    }

    public void imprimirFila(){ //c. Imprimir o conteúdo da fila de processos em determinado momento. Cada processo possui um número identificador.
        Fila aux = new Fila(processos.getTamanho());
        if (processos.vazia()){
            System.out.println("a fila esta vazia!");
            return;
        }
        while (!processos.vazia()){
            int x = retirarProcesso();
            aux.insere(x);
            System.out.println("Id do processo: "+x);
        }
        while (!aux.vazia()){
            processos.insere(aux.remove());
        }
    }

}
