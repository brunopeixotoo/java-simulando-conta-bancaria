/**
 * <h1>Pequeno Simulador de Caixa de Banco<h1>
 * O simulador pede entrada de dados de algumas infromações práticas:
 * Conta(numero), Agência(agencia), Nome(nome) e Saldo(saldo).
 * 
 * <b>Note:</b> Leia atentamente a documentação desta classe 
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Bruno Rodrigues Peixoto
 * @version 1.0
 * @since 01/09/2023
 */


 /**
  * A importação dessas bibliotecas é para o bom uso de uma das suas funções
  A entrada de dados pelos usuários.
  */
import java.util.Locale;
import java.util.Scanner;

public class SimuladorCaixa {
        /**
         * Este método é usado para receber a entrada de dados de um simulador de caixa bancário
         * Scanner tem como objetivo uma maior iteração assertiva por parte do usuário.
         */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("----------- Simulador de Caixa -----------");

        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        int saldo = scanner.nextInt();


        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta "+ numero +" e seu saldo de R$" + saldo +" já está disponível!");



    }

}