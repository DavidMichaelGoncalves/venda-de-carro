package com.company;

public class Main {

    public static void main(String[] args) {
	    Carro carro = new Carro(2017,"gol", 20000);
        carro.setAno(2001);
        carro.setModelo("Gol");
        System.out.println
                ("Ano: " +  carro.getAno() + "\n" +
                        "Modelo: " + carro.getModelo() +"\n" +
                        "Preço: " + carro.getPreco());
    }
}
