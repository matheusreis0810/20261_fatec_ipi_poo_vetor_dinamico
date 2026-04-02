import java.util.Comparator;
public class CriterioAvaliacaoComparator implements Comparator <Musica>{
    @Override
    public int compare(Musica m1, Musica m2) {
        if(m1.getAvaliacao() > m2.getAvaliacao())
            return -1;
        if(m1.getAvaliacao() < m2.getAvaliacao())
            return 1;
        return m1.getTitulo().compareTo(m2.getTitulo());
    }
}