package arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas: ");
        
        int qtdeNotas = sc.nextInt();
        double[] notasAlunoC = new double[qtdeNotas];
        for(int i = 0; i < qtdeNotas; i++){
            System.out.print("Digite a nota " + (i+1) + ": ");
            notasAlunoC[i] = sc.nextDouble();
        }

        double totalC = 0;
        for(double nota : notasAlunoC){
            totalC += nota;
        }
        double media = totalC / notasAlunoC.length;
        System.out.println("A média é: " + media);

        sc.close();
    }
    
}
