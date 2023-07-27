import java.util.Locale;
import java.util.Scanner;

public class UsuarioMovimentacao {
    

    public static void main(String[] args) {         
        CriaConta();
    }  

    private static int IsNumeric(String parseInt) {
       if (parseInt == null || parseInt == "") {
           System.out.println("Não pode ser nulo ou em branco.");
       }
       try {
        int value = Integer.parseInt(parseInt);
        return value;
       } catch (Exception e) {
        if(e != null){
            System.out.println("Caractere informado não aceito.");
            CriaConta();
        }
       }
    return 0;
    }
    
    private static void CriaConta() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    ContaTerminal conta = new ContaTerminal();
    System.out.println("Digite o seu Nome: ");
    conta.nomeCliente = scanner.next();
    System.out.println("Digite o sua conta: ");
    conta.numCOnta = IsNumeric(scanner.next());
    System.out.println("Digite o sua agencia: ");
    conta.numAgencia = scanner.next();
    System.out.println("Sua moovimentacão: ");
    conta.movimentacao = IsNumeric(scanner.next());
    conta.saldo = conta.saldo + conta.movimentacao;

    String msg = new String();
    msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.3f já está disponível para saque.", conta.nomeCliente, conta.numAgencia, conta.numCOnta, conta.saldo);
    System.out.println(msg);
    }

   
}


