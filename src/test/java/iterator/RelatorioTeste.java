package iterator;

import org.example.Projeto;
import org.example.Relatorio;
import org.example.Tarefa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioTeste {

    @Test
    void deveContarTarefasConcluidasProjeto() {
        Projeto projeto = new Projeto(
                new Tarefa("Criar Banco de Dados", true),
                new Tarefa("Desenvolver API", true),
                new Tarefa("Criar Tela de Login", false),
                new Tarefa("Escrever Testes", true)
        );
        assertEquals(3, Relatorio.contarTarefasConcluidasProjeto(projeto));
    }

    @Test
    void deveContarTotalTarefasProjeto() {
        Projeto projeto = new Projeto(
                new Tarefa("Criar Banco de Dados", true),
                new Tarefa("Desenvolver API", true),
                new Tarefa("Criar Tela de Login", false),
                new Tarefa("Escrever Testes", true)
        );
        assertEquals(4, Relatorio.contarTotalTarefasProjeto(projeto));
    }
}
