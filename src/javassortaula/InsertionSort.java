package javassortaula;

import java.util.Comparator;

public class InsertionSort<T extends Comparable<T>> {
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }

    private void insert(T[] v, int i, Comparator<T> comparator, boolean decrescente) {
        T eleito = v[i];
        int indice_comp = i - 1;
        
        // Ordenação decrescente
        if (decrescente) {
            while (indice_comp >= 0 && comparator.compare(eleito, v[indice_comp]) > 0) {
                this.contaComparacoes++;
                v[indice_comp + 1] = v[indice_comp];
                indice_comp--;
            }
        } 
        // Ordenação crescente
        else {
            while (indice_comp >= 0 && comparator.compare(eleito, v[indice_comp]) < 0) {
                this.contaComparacoes++;
                v[indice_comp + 1] = v[indice_comp];
                indice_comp--;
            }
        }
        this.contaComparacoes++;
        v[indice_comp + 1] = eleito;
    }

    // Método para ordenar em ordem decrescente ou crescente usando Comparator
    public void sort(T[] v, Comparator<T> comparator, boolean decrescente) {
        this.contaComparacoes = 0;
        for (int i = 1; i < v.length; i++) {
            insert(v, i, comparator, decrescente);
        }
    }

    // Método para ordenar em ordem decrescente ou crescente usando Comparable
    public void sort(T[] v, boolean decrescente) {
        this.contaComparacoes = 0;
        for (int i = 1; i < v.length; i++) {
            T eleito = v[i];
            int indice_comp = i - 1;

            if (decrescente) {
                while (indice_comp >= 0 && eleito.compareTo(v[indice_comp]) > 0) {
                    this.contaComparacoes++;
                    v[indice_comp + 1] = v[indice_comp];
                    indice_comp--;
                }
            } else {
                while (indice_comp >= 0 && eleito.compareTo(v[indice_comp]) < 0) {
                    this.contaComparacoes++;
                    v[indice_comp + 1] = v[indice_comp];
                    indice_comp--;
                }
            }
            this.contaComparacoes++;
            v[indice_comp + 1] = eleito;
        }
    }

    // Método de ordenação padrão usando Comparator (crescente)
    public void sort(T[] v, Comparator<T> comparator) {
        sort(v, comparator, false);  // Ordem crescente por padrão
    }

    // Método de ordenação padrão usando Comparable (crescente)
    public void sort(T[] v) {
        sort(v, false);  // Ordem crescente por padrão
    }
}
