public class TarefaAdicionarElementoSemThread {
    public Lista lista;
    public int numeroRepeticao;

    public TarefaAdicionarElementoSemThread(Lista listaParametro, int numeroRepeticao) {
        this.lista = listaParametro;
        this.numeroRepeticao = numeroRepeticao;

        for (int i = 0; i < 10; i++) {
            lista.adicionaElementos("Repeticao " + numeroRepeticao + " - " + i);
        }
    }
    
    
}
