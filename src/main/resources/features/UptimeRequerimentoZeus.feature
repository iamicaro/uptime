#language: pt
#author: Ícaro Silva
#automation: Ícaro Silva
#version: 1.0
#encoding: iso-8859-1

Funcionalidade: Verificar disponibilidade do sistema Requerimento Zeus
  
  - Narrativa: Verificar disponibilidade do sistema Requerimento Zeus
  
  - Fora de escopo: Outros sistemas

  Contexto: 
    Dado que esteja na pagina de login no Zeus

  @IDZEUS
  Cenario: Validar disponibilidade do sistema STAR
    Quando logar no Zeus
    Entao validar pagina inicial
