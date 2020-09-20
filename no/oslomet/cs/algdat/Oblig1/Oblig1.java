package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        ombyttinger(a);
        return a[a.length-1];
        
    }


    public static int ombyttinger(int[] a) {
        int counter=0;
        for (int j = 0; j < a.length; j++){
            if (a[j] > a[j + 1]) {
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            counter++;

            }
        }
        return counter;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a){                                                                  
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Tabellen er usortert");
            }
        }


        //deklarer en variabel som teller antall ulike tall den skal være lik 0.
        int tall = 0;

        //Nå teller vi om hvor mange er ulike i listen:


        for (int i = 0; i < a.length; ++i) {
            while (i < a.length && a[i] == a[i + 1]) {
                i++;
            }
            tall++;
        }
        return tall;
    }



    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int antallUlike = 0;

        for (int i = 0; i < a.length; i++) {
            Boolean add = true;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    add = false;
                    break;
                }
            }
            if (add) {
                System.out.println(a[i]);
                antallUlike++;

            }return antallUlike;

        }


public static int partisjoner(int a[], int min, int max){
            int pivot = a[max];
            int i = (min-1);

            for (int j = min; j < max; j++) {
                if (a[j] < pivot) {
                    i++;

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;


                }
            }
            int temp = a[i+1];
            a[i+1] = a[max];
            a[max] = temp;

            return i+1;

        }

        public static void sorter(int a[], int min, int max){
            if (min < max) {
                int partisjon = partisjoner(a, min, max );
                sorter(a, min, max partisjon-1)  ;
                sorter(a, min partisjon+1, max);
                
            }
        }
    ///// Oppgave 4 //////////////////////////////////////
    public static List<Integer> delsortering(int[] a) {
            sorter(a, min: 0, max:a.length-1);
           
            List<Integer> oddetall
            
        }

    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }






    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }





















