package br.com.esportes.estudos.designpatterns.structural.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
