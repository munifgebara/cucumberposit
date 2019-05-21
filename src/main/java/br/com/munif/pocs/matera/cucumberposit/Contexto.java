package br.com.munif.pocs.matera.cucumberposit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contexto {

    private final Set<String> operacoes;
    private final Set<Pessoa> autorizacoes;
    private final Set<Pessoa> cancelamentos;

    public Contexto() {
        operacoes = new HashSet<>();
        autorizacoes = new HashSet<>();
        cancelamentos = new HashSet<>();
    }

    public Set<String> getOperacoes() {
        return operacoes;
    }

    public Set<Pessoa> getAutorizacoes() {
        return autorizacoes;
    }

    public Set<Pessoa> getCancelamentos() {
        return cancelamentos;
    }

    public String getEstado(Pessoa nome) {
        if (autorizacoes.contains(nome)) {
            return "AUTORIZADO";
        }
        if (cancelamentos.contains(nome)) {
            return "CANCELADO";
        }
        return "AUSENTE";
    }

}
