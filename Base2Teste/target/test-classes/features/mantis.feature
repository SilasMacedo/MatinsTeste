@iniciarTeste
Feature: Realizar login
  Eu como usuario quero preencher o formulario para criar nova tarefa
  
  Scenario: Acessar a home
  Given que esteja na pagina
  And Preencher o User name
  And Clicar em EntrarName
  When Preencher a senha
  And Clicar em EntrarSenha
  Then Acessar a pagina secreta
  
  
  