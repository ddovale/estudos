package br.com.esportes.estudos.designpatterns.creational.factorymethod;

public class Mulher extends Pessoa {
    public Mulher(String nome) {
        this.nome = nome;
        System.out.println("Olá senhora " + this.nome);
    }
}
