package com.Digital.Innovation.One.Aula2;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();

        System.out.println(suppliers.get());
    }
}
class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa (){
        nome = "Joao";
        idade = 23;
    }
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d",nome,idade);
    }
}
