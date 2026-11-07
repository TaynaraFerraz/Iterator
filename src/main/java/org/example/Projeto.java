package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Projeto implements Iterable<Tarefa>{
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public Projeto(Tarefa... tarefas) {
        this.tarefas = Arrays.asList(tarefas);
    }

    @Override
    public Iterator<Tarefa> iterator() {
        return tarefas.iterator();
    }
}
