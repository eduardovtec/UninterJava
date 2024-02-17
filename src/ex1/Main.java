package ex1;

import ex2.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9,10,3));
        Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(6,7,4));

        a1.info();
        a2.info();

    }
}