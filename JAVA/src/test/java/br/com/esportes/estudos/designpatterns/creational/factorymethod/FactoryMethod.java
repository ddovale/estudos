package br.com.esportes.estudos.designpatterns.creational.factorymethod;

public class FactoryMethod {
    public static void main(String[] args) {
        FactoryPessoa factoryPessoa = new FactoryPessoa();
        Pessoa pessoa1 = factoryPessoa.getPessoa("Daniel", "M");
        Pessoa pessoa2 = factoryPessoa.getPessoa("Camila", "F");
    }
}
