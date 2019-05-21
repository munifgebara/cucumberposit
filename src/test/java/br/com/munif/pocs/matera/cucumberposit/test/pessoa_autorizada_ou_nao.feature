Feature: Verifica se a Pessoa é autorizada ou cancelada
    Este teste verifica se a pessoa esta em qual lista

   Scenario: Teste1
        When verifica estado "02393714960"
        Then deve retornar ausente

     Scenario: Teste2
        When verifica estado "57040040000184"
        Then deve retornar ausente

     Scenario: Teste3
        When verifica estado "57040040000184"
        Then deve retornar ausente

     Scenario: Teste4
        Given autoriza "02393714960"

        When verifica estado "02393714960"
        Then deve retornar autorizado

     Scenario: Teste5
        Given autoriza "57040040000184"

        When verifica estado "57040040000184"
        Then deve retornar autorizado

     Scenario: Teste6
        Given autoriza "57040040"

        When verifica estado "57040040000184"
        Then deve retornar autorizado

     Scenario: Teste7
        Given cancela "02393714960"
        When verifica estado "02393714960"
        Then deve retornar cancelado

     Scenario: Teste8
        Given cancela "57040040000184"
        When verifica estado "57040040000184"
        Then deve retornar cancelado

     Scenario: Teste9
        Given cancela "57040040"
        When verifica estado "57040040000184"
        Then deve retornar cancelado


