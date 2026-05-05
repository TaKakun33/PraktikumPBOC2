/* File        : Main.java
 * Deskripsi   : demonstrasi Kelas Generik, Metode Generik, dan Larik Generik (Main Program)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 5 mei 2026
 */

public class Main {

    public static void main(String[] args) throws Exception {
        
        /***** Kelas Generik *****/
        Datum<Anabul> D1 = new Datum<>(new Kucing("M1K0", 4.0));
        Datum<Anabul> D2 = new Datum<>(new Anjing("T1N4"));

        D1.tampilkanAnabul(D1.getIsi());
        System.out.println();

        D2.tampilkanAnabul(D2.getIsi());
        System.out.println();

        D1.setIsi(new Anggora("Kiki", 3.4));
        D1.tampilkanAnabul(D1.getIsi());
        System.out.println();

        D1.setIsi(new KembangTelon("Lulu", 3.4));
        D1.tampilkanAnabul(D1.getIsi());
        System.out.println();
        
        /***** Metode Generik *****/

        // Penukaran dua Integer
        Datum<Integer> intA = new Datum<>(3);
        Datum<Integer> intB = new Datum<>(6);
        System.out.println("[Integer] Sebelum Tukar: a = " + intA.getIsi() + ", b = " + intB.getIsi());

        OperatorGenerik.Tukar(intA, intB);
        System.out.println("[Integer] Setelah Tukar : a = " + intA.getIsi() + ", b = " + intB.getIsi() + "\n");
 
        // Penukaran dua String
        Datum<String> strA = new Datum<>("Halo");
        Datum<String> strB = new Datum<>("Dunia");
        System.out.println("[String] Sebelum Tukar: a = " + strA.getIsi() + ", b = " + strB.getIsi());

        OperatorGenerik.Tukar(strA, strB);
        System.out.println("[String] Setelah Tukar : a = " + strA.getIsi() + ", b = " + strB.getIsi() + "\n");

        // Penukaran dua Anabul
        Datum<Anabul> anabulA = new Datum<>(new Anjing("BiLy"));
        Datum<Anabul> anabulB = new Datum<>(new Kucing("Maung", 4.5));
        System.out.println("[Anabul] Sebelum Tukar: a = " + anabulA.getIsi().getNama() + " | b = " + anabulB.getIsi().getNama());

        OperatorGenerik.Tukar(anabulA, anabulB);
        System.out.println("[Anabul] Setelah Tukar : a = " + anabulA.getIsi().getNama() + " | b = " + anabulB.getIsi().getNama() + "\n");

        // Fungsi generik Bobot2
        Kucing kucingA = new Kucing("Diki", 4.5);
        Anggora kucingB = new Anggora("Cyly", 3.4);
        KembangTelon kucingC = new KembangTelon("Didi", 2.8);
 
        double totalBobot1 = OperatorGenerik.Bobot2(kucingA, kucingB);
        System.out.println("[Bobot2] " + kucingA.getNama() + " + " + kucingB.getNama() + " = " + totalBobot1 + " kg");
 
        double totalBobot2 = OperatorGenerik.Bobot2(kucingB, kucingC);
        System.out.println("[Bobot2] " + kucingB.getNama() + " + " + kucingC.getNama() + " = " + totalBobot2 + " kg\n");

        /***** Larik Generik *****/

        // Konstruktor Data membutuhkan T[] sebagai template untuk membuat array generik
        // Dibuat array Anabul[0] kosong sebagai contohRuang, lalu di-copyOf menjadi 100 slot
        Anabul[] templateAnabul = new Anabul[0];
        Data<Anabul> dataAnabul = new Data<>(templateAnabul);
 
        // Demonstrasi setIsi (b): mengisi beberapa posisi dengan objek keluarga Anabul
        dataAnabul.setIsi(1, new Kucing("Ita", 4.0));
        dataAnabul.setIsi(2, new Anjing("Momo"));
        dataAnabul.setIsi(3, new Burung("Pita"));
        dataAnabul.setIsi(4, new Anggora("Ama", 3.4));
        dataAnabul.setIsi(5, new KembangTelon("Damar", 2.8));
 
        // Demonstrasi getSize (d): menampilkan jumlah elemen efektif
        System.out.println("getSize() = " + dataAnabul.getSize() + " elemen efektif");
        System.out.println();
 
        // Demonstrasi getIsi (c): mengakses dan menampilkan setiap elemen
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul a = dataAnabul.getIsi(i);
            System.out.println("Data ke-" + i + ":");
            Datum.tampilkanAnabul(a);
            System.out.println();
        }
    }
}
