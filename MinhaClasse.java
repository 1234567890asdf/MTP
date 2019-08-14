
package estudante;

import java.util.Scanner;


public class MinhaClasse {

    public static void main(String[] args) {
        Estudante meuNome = new Estudante();
        Scanner input = new Scanner( System.in );
        meuNome.nome = "Cristiano Gomes";
        meuNome.endereço = "Rua gaivota quadra 11 casa 13 Parque Lago";
        meuNome.idade = 20;
        meuNome.notaMatematica = 6;
        meuNome.notaPortugues = 8;
        meuNome.notaCiencias = 7;
        System.out.printf("nome: %s\n", meuNome.nome);
        System.out.printf("endereço: %s\n", meuNome.endereço);
        System.out.printf("idade: %s\n", meuNome.idade);
        System.out.printf("notaMatematica: %s\n", meuNome.notaMatematica);
        System.out.printf("notaPortugues: %s\n", meuNome.notaPortugues);
        System.out.printf("notaCiencias: %s\n", meuNome.notaCiencias);
        
        double exemplo = meuNome.getMedia();
        System.out.printf("Media: %.2f\n", exemplo);
        
        
    
    
    }
    
}
