#language: pt
#author: Ícaro Silva
#automation: Ícaro Silva
#version: 1.0
#encoding: iso-8859-1

Funcionalidade: Verificar disponibilidade do sistema STAR
  
  - Narrativa: Validar disponibilidade do sistema STAR
  
  - Fora de escopo: Outros sistemas

  Contexto: 
    Dado que esteja na pagina de login no Star

  @IDSTAR
  Cenario: Validar disponibilidade do sistema STAR
    Quando logar no Star
    Entao validar pagina inicial
