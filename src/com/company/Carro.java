package com.company;

public class Carro {
    private int ano;
    private  String modelo;
    private double preco;

    public Carro(int ano, String modelo , double preco){
        if(ano >= 1891){
            this.setAno(ano);
        }else {
            System.out.println
                    ("O Ano informado está inválido. Por isso usaremos 2017! ");
            this.setAno(2017);
        }
        if(preco >0){
            this.setPreco(preco);
        }else {
            System.out.println
                    ("O preço não é valido. Por isso usaremos 40.000,00");
            this.setPreco(40000.0);
        }
    }
    public Carro (String modelo, double preco ){
        this(2017,modelo,preco);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
