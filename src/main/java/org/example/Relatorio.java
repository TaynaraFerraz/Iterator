package org.example;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarTarefasConcluidasProjeto(Projeto projeto) {
        int quantidade = 0;
        for (Tarefa tarefa : projeto) {
            if (tarefa.isConcluida()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalTarefasProjeto(Projeto projeto) {
        int quantidade = 0;
        for (Iterator t = projeto.iterator(); t.hasNext(); ) {
            quantidade++;
            t.next();
        }
        return quantidade;
    }
}
