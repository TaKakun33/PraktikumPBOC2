/* File       : MTitik.java
 * Deskripsi  : Berisi artibut dan method dalam class Garis
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Februari 2026 
 */

public class MGaris{
    public static void main(String[] args) {
        Titik T1 = new Titik(0,3);
        Titik T2 = new Titik(5,9);
        Garis G1 = new Garis();
        Garis G2 = new Garis(T1,T2);

        System.out.println("Garis G1: ");
        G1.getAwal().printTitik();
        G1.getAkhir().printTitik();

        G2.setAwal(T2);
        G2.setAkhir(T1);
        
        System.out.println("\nGaris G2: ");
        G2.getAwal().printTitik();
        G2.getAkhir().printTitik();
    
        System.err.println("\nCounter Garis : " + Garis.getCounterGaris());
        System.out.println("Panjang Garis G1 : " + G2.panjangGaris());
        System.out.println("Gradien Garis G1 : " + G2.gradien());

        System.out.println("\nTitik Tengah dari garis G3 :");
        Titik T3 = G2.titikTengah();
        T3.printTitik();

        Garis G3 = new Garis(new Titik(1,2), new Titik(3,6));
        System.out.println("\nHasil dari printGaris() dari G3: ");
        G3.printGaris();

        Garis G4 = new Garis(new Titik(2,0), new Titik(4,4));
        System.out.println("\nHasil dari printGaris() dari G4: ");
        G4.printGaris();

        Garis G5 = new Garis(new Titik(2,1), new Titik(6,4));
        System.out.println("\nHasil dari printGaris() dari G5: ");
        G5.printGaris();

        Garis G6 = new Garis(new Titik(2,6), new Titik(5,2));
        System.out.println("\nHasil dari printGaris() dari G6: ");
        G6.printGaris();

        System.out.println("\nApakah Garis G3 dan G4 itu sejajar? " + G3.isSejajar(G4));
        System.out.println("Apakah Garis G5 dan G6 itu sejajar? " + G5.isSejajar(G6));

        System.out.println("Apakah Garis G3 dan G4 itu Tegak Lurus? " + G3.isTegakLurus(G4));
        System.out.println("Apakah Garis G5 dan G6 itu Tegak Lurus? " + G5.isTegakLurus(G6));

        System.err.println("\nPersamaan Garis dari G3 :");
        G3.persamaanGaris();

    }
}