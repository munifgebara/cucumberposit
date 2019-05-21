package br.com.munif.pocs.matera.cucumberposit.test;

import br.com.munif.pocs.matera.cucumberposit.Contexto;
import br.com.munif.pocs.matera.cucumberposit.Pessoa;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class AutorizadoOuNaoStepDefinitions {

    public Contexto contexto;

    public String estado;

    public AutorizadoOuNaoStepDefinitions() {
        contexto = new Contexto();
        System.out.println("Novo Contexto");
    }

    @Given("^autoriza \"([^\"]*)\"$")
    public void autoriza(String nome) {
        this.contexto.getAutorizacoes().add(new Pessoa(nome));
    }

    @Given("^cancela \"([^\"]*)\"$")
    public void cancela(String nome) {
        this.contexto.getCancelamentos().add(new Pessoa(nome));
    }

    @When("verifica estado \"([^\"]*)\"$")
    public void verifica_estado(String nome) {
        System.out.println("Verificando estado de " + nome);
        estado = contexto.getEstado(new Pessoa(nome));
    }

    @Then("deve retornar cancelado")
    public void deve_retornar_cancelado() {
        assertEquals("CANCELADO", estado);
    }

    @Then("deve retornar autorizado")
    public void deve_retornar_autorizado() {
        assertEquals("AUTORIZADO", estado);
    }

    @Then("deve retornar ausente")
    public void deve_retornar_ausente() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("AUSENTE", estado);
    }

    @Then("deve retornar {string}")
    public void deve_retornar(String string) {
        if (string.equalsIgnoreCase("cancelado")) {
            assertEquals("CANCELADO", estado);
        } else {
            assertEquals("AUTORIZADO", estado);
        }

    }

}
