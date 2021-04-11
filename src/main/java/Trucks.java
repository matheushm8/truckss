 
import java.util.Scanner;

    public class Trucks {
        Double maxFuel;
        Double actualFuel;
        Double distance;
        Double dieselPrice = 4.23;
        Double result;
        Double resposta;
        Scanner ler = new Scanner(System.in);
        Scanner ler1  = new Scanner(System.in);
   
    void verification() {
        
        System.out.println("QUER SABER QUANTO VAI GASTAR PRA ENCHER O TANQUE DO SEU CAMINHÃO? ");
        System.out.println("QUAL É O TAMANHO DO SEU TANQUE DE COMBUSTIVEL?");
        maxFuel = ler.nextDouble();
        System.out.println("QUANTOS LITROS ELE ESTÁ AGORA?");
        actualFuel = ler1.nextDouble();
        System.out.println("O VALOR A SER PAGO PARA ENXER O TANQUE É DE:"  + calculate());
        verification2();
        }
         double calculate() {
        result = (maxFuel - actualFuel) * dieselPrice;        
        return result;
         }
        void verification2() {
        
        System.out.println("QUER SABER QUANTOS KM SEU CAMINHÃO FAZ COM O TANQUE CHEIO? ");
        System.out.println("QUAL É O TAMANHO DO SEU TANQUE DE COMBUSTIVEL?");
        maxFuel = ler.nextDouble();
        System.out.println("QUANTOS KM ELE FAZ POR LITRO?");
        distance = ler1.nextDouble();
        System.out.println("A DISTANCIA QUE ELE IRÁ PERCORRER É:"  + Distance2());
        verification3();
      
        }
    
        double Distance2() {
        result = maxFuel * distance;        
        return result;
         }
        
        void verification3() {
        System.out.println("QUER SABER QUANTOS KM SEU CAMINHÃO FAZ COM O NIVEL DE COMBUSTIVEL ATUAL? ");
        System.out.println("QUANTOS LITROS VOCÊ POSSUE NO MOMENTO?");
        actualFuel = ler.nextDouble();
        System.out.println("QUANTOS KM ELE FAZ POR LITRO?");
        distance = ler1.nextDouble();
        System.out.println("A DISTANCIA QUE ELE AINDA IRÁ PERCORRER É DE:"  + Distance3());
        
      
        }
        double Distance3() {
        result = (actualFuel * distance);        
        return result;
         }
        
    public static void main(String[] args) {

        Trucks trucks1 = new Trucks();
        trucks1.verification();
        
      }
    }
        
        
        
        
        
        
        
        
       