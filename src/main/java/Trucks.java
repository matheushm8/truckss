 
import java.util.Scanner;

    public class Trucks {
        Integer maxFuel;
        Integer actualFuel;
        Double dieselPrice = 4.23;
        Double result;
        String resposta;
        Scanner ler = new Scanner(System.in);
        Scanner ler1  = new Scanner(System.in);
   
    void verification() {
        
        System.out.println("QUER SABER QUANTO VAI GASTAR PRA ENCHER O TANQUE DO SEU CAMINHÃO? ");
        System.out.println("QUAL É O TAMANHO DO SEU TANQUE DE COMBUSTIVEL?");
        maxFuel = ler.nextInt();
        System.out.println("QUANTOS LITROS ELE ESTÁ AGORA?");
        actualFuel = ler1.nextInt();
        System.out.println("O VALOR A SER PAGO PARA ENXER O TANQUE É DE:"  + calculate());
      
        }
    
        double calculate() {
        result = (maxFuel - actualFuel) * dieselPrice;        
        return result;
         }
     
    public static void main(String[] args) {

        Trucks trucks1 = new Trucks();
        trucks1.verification();
        
        
         }
    }
        
        
        
        
        
        
        
        
       