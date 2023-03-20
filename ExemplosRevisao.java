package AtividadeRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);

    // criar metodos da classe
    public void exemplo1() {
        // criar um projeto para ler 2 notas e a frequencia
        // e falar se o aluno etsa reprovado ou aprovado
        // ler a 1 nota
        System.out.println("Informe a Primeira nota do aluno");
        int nota1 = sc.nextInt();
        // ler a 2 nota
        System.out.println("Informe a Segunda nota do aluno");
        int nota2 = sc.nextInt();
        // calcular a media das notas
        double media = (nota1 + nota2) / 2;
        // mostrar a media calculada
        System.out.println("A média do aluno é " + media);
        // informar o total de aulas
        System.out.println("Professor, informe o total de aulas dadas");
        int aulasDadas = sc.nextInt();
        // informar quantidade de faltas do aluno
        System.out.println("Professor, informe o número de faltas do aluno");
        int nfaltas = sc.nextInt();
        // calcular a % de frequencia
        double frequencia = (aulasDadas - nfaltas) * 100 / aulasDadas;
        // mostrar a % de frequencia do aluno
        System.out.println("O aluno teve " + frequencia + "%");
        // se (media>=50 e frequencia>=75)
        if (media >= 50 && frequencia >= 75) {
            System.out.println("O aluno está Aprovado");
        } else if (media < 50 && frequencia >= 75) {
            System.out.println("O aluno está de recuperação");
        } else {
            System.out.println("O aluno está reprovado");
        }
    }
}
