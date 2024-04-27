package com.exercicio.chat.gpt;

import java.util.ArrayList;
import java.util.List;

public class Produtor {

    Integer tamanhoBuffer;
    List<Integer> produto = new ArrayList<>();
    String[] frutas = { "Abóbora", "Abobrinha", "Acelga",
            "Agrião",
            "Alface americana",
            "Alface crespa",
            "Alface lisa",
            "Alface roxa",
            "Alho",
            "Alho poró",
            "Almeirão",
            "Azedinha",
            "Batata",
            "Batata doce",
            "Berinjela",
            "Beterraba",
            "Brócolis",
            "Cará",
            "Cebola",
            "Cebola roxa",
            "Cebolinha",
            "Cenoura",
            "Chicória",
            "Chuchu",
            "Cogumelo" };

    public Produtor(Integer tamanhoBuffer) {
        this.tamanhoBuffer = tamanhoBuffer;
    }

    public void produzir() {
        Integer cont = 0;
        while (cont <= tamanhoBuffer) {
            produto.add(cont);
            System.out.println("Produtor produziu: " + frutas[cont]);
            cont++;
        }
    }
}
