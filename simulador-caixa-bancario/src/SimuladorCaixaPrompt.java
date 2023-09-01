/**
 * <h1>Pequeno Simulador de Caixa de Banco<h1>
 * O simulador pede entrada de dados de algumas informações práticas:
 * Conta(numero), Agência(agencia), Nome(nome) e Saldo(saldo).
 * Essa é uma segunda versão, posterior a uma versão usada com Scanner para melhor interatividade.
 * 
 * Muitas vezes o cliente não irá ter uma IDE para rodar o código,
 * por isso é importante desenvolver outras alternativas e
 * utilizar o Prompt de Comando ou o Power Shell é uma dessas alternativas.
 * 
 * Passos para utilizar a classe e método:
 * 1 - copiar o caminho onde se encontra o arquivo do simulador.
 * 2- abrir no Prompt(cd C:/Users/Documnts/caminho/)
 * 3- abrir a pasta "bin"(cd bin)
 * 4 - digitar o nome do arquivo e as entradas de dados em seguida.
 * (java SimuladorCaixaPrompt (2345(conta) 4256(agencia) Eusébio(nome) 1987( R$ saldo) )
 * 
 * 
 * <b>Note:</b> Leia atentamente a documentação desta classe 
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Bruno Rodrigues Peixoto
 * @version 1.0
 * @since 01/09/2023
 */

public class SimuladorCaixaPrompt {
        /**método é usado para receber a entrada de dados de um simulador de caixa bancário
         * pelo Prompt de Comando ou Power Shell
         * 
         * @param args irá receber os argumentos do Prompt ou Power Shell
         * É preciso que seja na ordem do programa.
         */
    public static void main(String[] args) {

        int numero = Integer.valueOf(args[0]);
        int agencia = Integer.valueOf(args[1]);
        String nome = args[2];
        int saldo = Integer.valueOf(args[3]);


        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta "+ numero +" e seu saldo de R$" + saldo +" já está disponível!");
    }
     
}
