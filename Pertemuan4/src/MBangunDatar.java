/* File       : MBangunDatar.java
 * Deskripsi  : Main dari class BangunDatar, Persegi, Lingkaran
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args) {

        /* ======== Implementasi class BangunDatar ======== */
        System.err.println("=== Bangun Datar ===");

        // Konstruktor BangunDatar BD1 dan BD2
        BangunDatar BD1 = new BangunDatar();
        BangunDatar BD2 = new BangunDatar(3,"merah", "hitam");

        // Getter dari BangunDatar BD1
        System.err.println("\nGetter dari BangunDatar BD1");
        System.err.println("jml Sisi : " + BD1.getJmlSisi() );
        System.err.println("warna : " + BD1.getWarna() );
        System.err.println("border : " + BD1.getBorder() );

        // Getter dari BangunDatar BD2
        System.err.println("\nGetter dari BangunDatar BD2");
        System.err.println("jml Sisi : " + BD2.getJmlSisi() );
        System.err.println("warna : " + BD2.getWarna() );
        System.err.println("border : " + BD2.getBorder() );

        // Setter dari BangunDatar BD1
        BD1.setJmlSisi(2);
        BD1.setBorder("Kuning");
        BD1.setWarna("Biru");

        // PrintInfo dari BangunDatar BD1
        System.err.println("\nPrint Info BangunDatar BD1 setekah di setter");
        BD1.printInfo();


        /* ======== Implementasi class Persegi ======== */
        System.err.println("\n=== Persegi ===");

        // Konstruktor BangunDatar P1 dan P2
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(40, "biru", "putih");

        // Getter dari BangunDatar P1
        System.err.println("\nGetter dari BangunDatar P1");
        System.err.println("jml Sisi : " + P1.getJmlSisi() );
        System.err.println("warna : " + P1.getWarna() );
        System.err.println("border : " + P1.getBorder() );
        System.err.println("sisi : " + P1.getSisi() );

        // Getter dari BangunDatar P2
        System.err.println("\nGetter dari BangunDatar P2");
        System.err.println("jml Sisi : " + P2.getJmlSisi() );
        System.err.println("warna : " + P2.getWarna() );
        System.err.println("border : " + P2.getBorder() );
        System.err.println("sisi : " + P2.getSisi() );
        
        // Setter dari Persegi P2
        P2.setSisi(30);

        // PrintInfo dari Persegi P2
        System.err.println("\nPrint Info Persegi P2 setekah di setter");
        P2.printInfo();


        /* ======== Implementasi class Lingkaran ======== */
        System.err.println("\n=== Lingkaran ===");

        Lingkaran L1 = new  Lingkaran();
        Lingkaran L2 = new Lingkaran(10, "kuning", "ungu");

        // Getter dari Lingkaran L1
        System.err.println("\nGetter dari Lingkaran L1");
        System.err.println("jml Sisi : " + L1.getJmlSisi() );
        System.err.println("warna : " + L1.getWarna() );
        System.err.println("border : " + L1.getBorder() );
        System.err.println("jari : " + L1.getJari() );

        // Getter dari Lingkaran L1
        System.err.println("\nGetter dari Lingkaran L2");
        System.err.println("jml Sisi : " + L2.getJmlSisi() );
        System.err.println("warna : " + L2.getWarna() );
        System.err.println("border : " + L2.getBorder() );
        System.err.println("jari : " + L2.getJari() );

        // Setter dari Lingkaran L2
        L2.setJari(5);

        // PrintInfo dari Lingkaran L2
        System.err.println("\nPrint Info Lingkaran L2 setekah di setter");
        L2.printInfo();
        

        /* Implementasi dari printCounterBangunDatar */
        System.err.println("\nHasil dari printCounterBangunDatar");
        BangunDatar.printCounterBangunDatar();

    }
}
