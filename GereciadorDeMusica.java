//importacoes para utilizar lista e uma lista de array
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane; //cria uma caixinha de interação
import java.util.Collections;


public class GereciadorDeMusica {
    public static void main(String[] args) {
        //tipo base e um tipo parametrico
        List <Musica> musicas = new ArrayList<>();
        int opcao;
        String menu = "0-Sair\n1-Cadastrar música\n2-Avaliar música\n3-Ver a lista de músicas";
        do{
            //cria uma caixinha de interação com o conteudo da variavel menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var musica = new Musica(titulo);
                    musicas.add(musica);
                    break;
                }
                case 2:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
                    for(int i=0; i<musicas.size(); i++){
                        if(musicas.get(i).getTitulo().equals(titulo)){
                            musicas.get(i).setAvaliacao(avaliacao);
                            JOptionPane.showMessageDialog(null, "Musica avaliada!");
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    //exibir a lista ordenada pelo titulo
                    //para tal, sera necessario implementar uma interface chamada Comaparable na classe musica
                    Collections.sort(musicas);
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }
                case 4:{
                    //ordenar por avalicao
                    //detalhe: nao vale mexer no metodo compareTo
                    //avaliacoes mais altas primeiro
                    //se empatar, desempatar pelo titulo
                    Collections.sort(musicas, new CriterioAvaliacaoComparator());
                    JOptionPane.showMessageDialog(null, musicas);
                    
                }
            }
        }while(opcao != 0);
    }
}
