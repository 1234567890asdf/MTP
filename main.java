
package pessoa;


import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Pessoa meuNome = new Pessoa();
     
       
        
        System.out.println("Que tipo de operacao desaja, leitura ou gravacao? ");
        Scanner in = new Scanner(System.in);
        String resposta = in.next();
        String op1 = new String("leitura");
        String op2 = new String("gravacao");
        Pessoa dados =  new Pessoa();
        if(op1.equals(resposta)){
            System.out.println("Informe seu nome: ");
            dados.setNome(in.next());
            System.out.println("Informe sua idade: ");
            dados.setIdade(in.nextInt());
            System.out.println("Informe seu endereco: ");
            dados.setEndereco(in.next());
        } else {
            System.out.println("a lista de pessoas esta vazia!!!");
        }
        
                }
    }
}
