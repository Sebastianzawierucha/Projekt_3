package projekt3;

import java.util.Arrays;
import java.util.Random;

public class Kubelek implements Sortable {

    public static int[] tab = new int[200];
    int licz;

    public int sort( int[] tablica) {
        tworzenie();
        System.out.println("\n To twoja nieposortowana tablica:\n");
        wyswietlanie();
        int i, j;
        int[] bucket = new int[201];
        Arrays.fill(bucket, 0);

        for (i = 0; i < 200; i++) {
            bucket[tab[i]]++;
            step_counting();
        }

        int k=0;
        for (i = 0; i < 201; i++) {
            for (j = 0; j<bucket[i]; j++) {
                tab[k++] = i;
            }

        }
        System.out.println("\n\n\n Posortowane: \n");
        wyswietlanie();
        System.out.println("\n\n Posortowane po "+licz+" próbach\n");
        licz = 0;
        return 0;

    }

    public int step_counting() {
        licz++;
        return 0;
    }

    public static void tworzenie() {
        Random srandom = new Random();
        for (int t = 0; t < 200; t++) {
            tab[t] = srandom.nextInt(200);
        }
    }

    public static void wyswietlanie(){
        for (int w = 0; w < 200 ; w++){
            int x = tab[w];
            System.out.print(x + ", ");
        }
    }
}
