import java.util.Random;
public class TesteV1 {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var v = new VetorDinamico();
        while(true){
            var valor = gerador.nextInt(1, 11);
            var oQueFazer = gerador.nextInt(0,2);
            switch (oQueFazer) {
                case 0:
                    System.out.println("Adicionando...");
                    v.adicionar(valor);
                    break;
                case 1:
                    System.out.println("Removendo...");
                    v.remover();
                    break;
            }
            System.out.println(v.toString()); //ve o estado do vetor
            System.out.println("=========================================");
            Thread.sleep(5000);
        }
    }
}
