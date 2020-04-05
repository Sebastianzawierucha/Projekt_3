package projekt3;

import java.util.Random;

public class Babelek implements Sortable {

    public static int[] tablica = new int[200];
    int zliczanie;
    public int sort(int[] tablica) {
        tworzenieTablicy();
        System.out.println("\n To twoja nieposortowana tablica:\n");
        wyswietl();
        for (int i = 0; i < 199; i++)
            for (int j = 0; j < 199-i; j++)
                if (tablica[j] > tablica[j+1])
                {
                    int tymczas = tablica[j];
                    tablica[j] = tablica[j+1];
                    tablica[j+1] = tymczas;
                    step_counting();
                }
        System.out.println("\n\n\n Posortowane: \n");
        wyswietl();
        System.out.println("\n\n Posortowane po "+zliczanie+" próbach\n");
        zliczanie = 0;
        return 0;
    }

    @Override
    public int step_counting() {

        this.zliczanie++;
        return 0;
    }

    public static void tworzenieTablicy() {
        Random random = new Random();
        for (int t = 0; t < 200; t++) {
            tablica[t] = random.nextInt(200);
        }
    }
    public static void wyswietl(){
        for (int w = 0; w < 200 ; w++){
            int x = tablica[w];
            System.out.print(x + ", ");
        }
    }
}

