package br.com.alura.codechella.application.evento;

import br.com.alura.codechella.domain.evento.Evento;

import java.util.List;

public interface RepositorioDeEvento {

    List<Evento> buscaPorCidade(String cidade);
}
