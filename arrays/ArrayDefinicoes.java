package arrays;

import java.util.Arrays;

public class ArrayDefinicoes {

    public static void main(String[] args) {
        
        // Método 1 criação array
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;        
        System.out.println(Arrays.toString(notasAlunoA));
        // fazer a média dos valores do array
        double totalA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalA += notasAlunoA[i];
        }
        System.out.println(totalA / notasAlunoA.length);
        
        final double notaArmazenada = 5.9;
        // Método 2 criação array (pouco usado)
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(notasAlunoB[0]);
        System.out.println(notasAlunoB[notasAlunoB.length - 1]);
        double totalB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalB += notasAlunoB[i];
        }
        System.out.println(totalB / notasAlunoB.length);

    }
}
