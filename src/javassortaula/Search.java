
package javassortaula;

import java.util.Comparator;

public class Search<T extends Comparable<T>> {
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
    public int linearSearch(Integer[] v, Integer x){
       this.contaComparacoes=0;
        for(int i=0;i<v.length;i++){
            this.contaComparacoes++;
            if(x==v[i])
                return i;
        }// fim for    
        return -1;
    }
    
    public int binarySearch(T[] v, T x){
        int inicio = 0, fim = v.length-1;
        this.contaComparacoes=0;
        while(inicio<=fim){
            int meio = (inicio+fim)/2;
            this.contaComparacoes++;
            if(x.compareTo(v[meio])==0)
                return meio;
            else
                if(x.compareTo(v[meio])<0)
                    fim = meio-1;
            else
                    inicio = meio+1;
        }// fim while
        return -1;
    }
    // overload do método binarySearch
     public int binarySearch(T[] v, T x, Comparator<T> comparador){
        int inicio = 0, fim = v.length-1;
        this.contaComparacoes=0;
        while(inicio<=fim){
            int meio = (inicio+fim)/2;
            this.contaComparacoes++;
            if(comparador.compare(x,v[meio])==0)
                return meio;
            else
                if(comparador.compare(x,v[meio])<0)
                    fim = meio-1;
            else
                    inicio = meio+1;
        }// fim while
        return -1;
    }
    
}
