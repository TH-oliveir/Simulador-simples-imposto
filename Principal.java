import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Principal {

  public static void main(String[] args) {

    Scanner Scanner = new Scanner(System.in);

    System.out.println("Seja bem vindo ao simulador de contribuicao imposto de renda!");
    System.out.println(" Escolha entre pessoa fisica (1), ou Pessoa juridica (2): ");
    System.out.println("SAIR - Encerrar o programa.\n");

    String texto = Scanner.nextLine();
    switch (texto.toUpperCase(Locale.ROOT)) {
      case "1":
        PessoaFisica pf = new PessoaFisica();
        try {

          System.out.println("Qual e o seu cpf ? ");
          pf.setCpf(Scanner.nextDouble());
          Scanner.nextLine();
          System.out.println("Qual e o seu nome ? ");
          pf.setName(Scanner.nextLine());
          System.out.println("Qual e o sua renda ? ");
          pf.setRendaBruta(Scanner.nextDouble());
          System.out.println(pf.toString());
          break;
        } catch (InputMismatchException | IllegalStateException exception) {
          System.out.println("Erro ao processar dados\n");
        } catch (Throwable e) {
          System.out.println("CPF INVALIDO TENTE NOVAMENTE!!\n");
          break;
        }

      case "2":
        PessoaJuridica pj = new PessoaJuridica();
        try {
          System.out.println("Qual e o nome da sua Empresa: ? ");
          pj.setName((Scanner.nextLine()));
          System.out.println("Qual e o seu cnpj ? ");
          pj.setCnpj((Scanner.nextDouble()));
          System.out.println("Qual e o sua renda ? ");
          pj.setRendaBruta((Scanner.nextDouble()));
          Scanner.nextLine();
          System.out.println(pj.toString());
          break;

        } catch (InputMismatchException e) {
          System.out.println("Erro ao processar dados\n");
        } catch (Throwable e) {
          System.out.println("CPF INVALIDO TENTE NOVAMENTE!\n");
          break;
        }
     default:
        System.out.println("Comando não reconhecido!!!\n");
        System.out.println("Até a proxima!!!\n");
        break;

    }
    Scanner.close();
  }

}

         