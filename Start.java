package projekt3;

import java.util.Scanner;
import static projekt3.Babelek.tablica;
import static projekt3.Kubelek.tab;

public class Start {

    public static boolean uruchomienie = true;
    public static Scanner wprowadzenie = new Scanner(System.in);

    public static void main(String[] args) {
        while (uruchomienie) {
            System.out.println("\n 1 - sortowanie bąbelkowe\n 2 - sortowanie kubełkowe \n 3 - wyjście \n");
           int wybor = wprowadzenie.nextInt();
       if (wybor == 1){
           Babelek babelek = new Babelek();
           Sortable s = babelek;
           s.sort(tablica);
           s.step_counting();
       }
       else if (wybor == 2){
           Kubelek kubelek = new Kubelek();
           Sortable k = kubelek;
           k.sort(tab);
           k.step_counting();

       }
       else if (wybor == 3){
           System.exit(0);
       }
       else{
           System.out.println("Bledny wybor");
       }

    }
        System.exit(0);
    }


}
