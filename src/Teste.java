import java.util.Locale;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String textoMaisculo;
        char letra;
        boolean verificador = true;

        Dinossauro skeep = new Dinossauro();
        while(verificador){
            System.out.println("Digite uma das letras em parenteses para executar a ação");
            System.out.println("(P)ular | (C)orrer | Co(M)er | \nC(A)ntar | Tomar (S)ol | Ficar na S(O)mbra" +
                    "                 |||E(X)it");
            textoMaisculo = scan.nextLine().toUpperCase();
            letra = textoMaisculo.charAt(0);

            switch(letra){
                case 'P':
                    skeep.pular();
                    break;
                case 'C':
                    skeep.correr();
                    break;
                case 'M':
                    skeep.comer();
                    break;
                case 'A':
                    skeep.cantar();
                    break;
                case 'S':
                    skeep.tomarSol();
                    break;
                case 'O':
                    skeep.ficarNaSombra();
                    break;
                case 'X':
                    verificador = false;
                    break;
                default:
                    System.out.println("Não é uma opção válida.");
                    break;
            }
        }


    }

}
