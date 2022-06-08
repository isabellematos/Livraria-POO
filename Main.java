
import java.util.Scanner;

public class ObjLivro {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* DECLARAÇÃO DO OBJETO DE CONTA*/
        Livro objLivro = new Livro();
        
        Scanner objScanner = new Scanner(System.in);
        
        String titulo = "";
        String autor = "";
        int paginas = 0;
        int ISBN = 0;
        double valor = 0.0;
    
        int opcao = 0;
        while(opcao != 3){
            //switch aqui!!!
            /*MENU DE ACESSO*/
        
        System.out.println("ESCOLHA UMA OPÇÃO (DIGITE O NUMERO): ");
        System.out.println("1 - CADASTRAR LIVRO ");
        System.out.println("2 - EXIBIR DADOS SOBRE DO LIVRO ");
        System.out.println("3 - SAIR ");
        opcao = objScanner.nextInt();
        
        objScanner.nextLine();
        
        double val = 0;
           switch(opcao){
               
               
               case 1:
                   //CHAMADA AO MÉTODO DE CADASTRO
                   
                    System.out.println("Digite o titulo do livro: ");
                    titulo = objScanner.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    autor = objScanner.nextLine();
                    System.out.println("Digite a quantidade de paginas do livro: ");
                    paginas = objScanner.nextInt();
                    System.out.println("Digite o numero ISBN do livro: ");
                    ISBN = objScanner.nextInt();
                    System.out.println("Digite o valor do livro: ");
                    valor = objScanner.nextDouble();
                    objLivro.cadastrar(titulo, autor, paginas, ISBN, valor);
                    break;
                   
               case 2:
                   //CHAMADA AO MÉTODO DE EXIBIR DADOS
                    objLivro.exibirDados();
                    break;
                
               case 3:
                   System.out.println("OBRIGADO POR USAR O SISTEMA");
                   break;
                
               default:
                   System.out.println("OPÇÃO INVÁLIDA! ");  
            }
        }
    }
}