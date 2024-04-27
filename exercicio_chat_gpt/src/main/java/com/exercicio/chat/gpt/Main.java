package com.exercicio.chat.gpt;

public class Main {
    public static void main(String[] args) {
        Integer tamanhoDoBuffer = 5;
        Produtor produtor = new Produtor(tamanhoDoBuffer);
        produtor.produzir();

    }
}