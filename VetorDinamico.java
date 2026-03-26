public class VetorDinamico {
    private int quantidade;
    private int capacidade;
    private int [] elementos;
    private static final int CAP_MINIMA = 4;
    public VetorDinamico(){
        quantidade = 0;
        capacidade = CAP_MINIMA;
        elementos = new int[capacidade];
    }

    public void adicionar(int e){
        if(estaCheio()){
            redimensionar(capacidade*2);
        }
        elementos[quantidade] = e;
        quantidade++;
    }

    public void remover(){
        if(!estaVazio()){
            quantidade--;
            if(capacidade > CAP_MINIMA && quantidade == capacidade/4){
                redimensionar(capacidade/2);
            }
        }
    }
    private void redimensionar(double fator){
        var novo = new int [(int)(capacidade*fator)];
        for(int i=0; i<quantidade; i++){
            novo[i] = elementos[i];
        }
        capacidade = novo.length;
        elementos = novo;
    }
    
    private void reduzirCapacidade(){
        var novo = new int[capacidade / 2];
        for(int i=0; i<quantidade; i++){
            novo[i] = elementos[i];
        }
        capacidade = novo.length;
        elementos = novo;
    }

    //copia da primeira 
    private void aumentarCapacidade(){
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