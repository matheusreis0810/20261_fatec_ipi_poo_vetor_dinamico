public class VetorDinamico {
    private int quantidade;
    private int capacidade;
    private int [] elementos;

    public VetorDinamico(){
        quantidade = 0;
        capacidade = 4;
        elementos = new int[capacidade];
    }

    public void adicionar(int e){
        if(estaCheio()){
            aumentarCapacidade();
        }
        elementos[quantidade] = e;
        quantidade++;
    }

    //copia da primeira 
    public void aumentarCapacidade(){
        var novo = new int[capacidade * 2];
        for(int i=0; i<quantidade; i++){
            novo[i] = elementos[i];
        }
        //capacidade *=2;
        capacidade = novo.length;
        elementos = novo;
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }

    public boolean estaCheio(){
        return quantidade == capacidade;
    }
    //concatenar variaveis do vetor dinamico
    @Override
    public String toString() {
        //qtde: 2
        //capacidade: 4
        //2, 7
        var sb = new StringBuilder("");
        sb.append("Qtde: ").append(quantidade);
        sb.append("\n").append("Cap: ").append(capacidade);
        if(!estaVazio()){
            sb.append("\n");
            for(int i=0; i<quantidade; i++){
                sb.append(elementos[i]).append(" ");
            }
        }
        return sb.toString();
    }
}