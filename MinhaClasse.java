
package estudante;

import java.util.Scanner;


public class MinhaClasse {

    public static void main(String[] args) {
        Estudante meuNome = new Estudante();
        Scanner input = new Scanner( System.in );
        meuNome.setNome("Cristiano Gomes");
        meuNome.setEndereço("Rua gaivota quadra 11 casa 13 Parque Lago");
        meuNome.setIdade(20);
        meuNome.setNotaMatematica(6);
        meuNome.setNotaPortugues(8);
        meuNome.setNotaCiencias(7);
        System.out.printf("nome: %s\n", meuNome.getNome());
        System.out.printf("endereço: %s\n", meuNome.getEndereço());
        System.out.printf("idade: %s\n", meuNome.getIdade());
        System.out.printf("notaMatematica: %s\n", meuNome.notaMatematica);
        System.out.printf("notaPortugues: %s\n", meuNome.notaPortugues);
        System.out.printf("notaCiencias: %s\n", meuNome.notaCiencias);
        
        double exemplo = meuNome.getMedia();
        System.out.printf("Media: %.2f\n", exemplo);
        
        
    
    
    }
    
}
/*public double getMedia (){
        double result = 0;
        result = (notaMatematica+notaPortugues+notaCiencias)/3;
        return result;*/