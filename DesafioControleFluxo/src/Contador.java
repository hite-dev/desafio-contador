import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
           
            System.out.println("Parâmetros inválidos!");
            System.out.println("Segundo parâmetro deve ser maior que o primeiro.");
        }

           
    }
      
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if (primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
            
            
      }else{
        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++){
            System.out.println("imprimindo número " + i);
        }

      }
        
      
}
}
