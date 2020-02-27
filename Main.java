import java.util.Scanner;

/**
 * Exeption: precisa ser tratado
 * RunTimeException: não utilizar
 * rm *.class; javac Main.java && java Main
 */

class Main {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    int dia = 0, mes = 0, ano = 0;

    try {
      System.out.print("digite o dia: ");
      dia = Integer.parseInt(entrada.nextLine());
      System.out.print("digite o mes:");
      mes = Integer.parseInt(entrada.nextLine());
      System.out.print("digite o ano:");
      ano = Integer.parseInt(entrada.nextLine());
    } catch (NumberFormatException exception) { 
      exception.printStackTrace();
      System.out.print("digite um valor valido!");
    }

    Data d1 = new Data(dia, mes, ano);

    System.out.println(d1.diferenca(new Data(2, 10, 2020)));
    // System.out.println("d1 =" + d1.toString());
  }
}
