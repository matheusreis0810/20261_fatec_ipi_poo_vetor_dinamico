import java.util.Random;
public class TesteV1 {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var v = new VetorDinamico();
        while(true){
            var valor = gerador.nextInt(1, 11);
            v.adicionar(valor);
            System.out.println(v.toString()); //ve o estado do vetor
            Thread.sleep(5000);
        }
    }
}
