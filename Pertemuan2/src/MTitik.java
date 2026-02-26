/* File       : MTitik.java
 * Deskripsi  : Berisi artibut dan method dalam class titik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Februari 2026 
 */

public class MTitik{
    public static void main(String[] args) {
        Titik T1 = new Titik();  // Membuat objek Titik T1 (0,0)
        T1.setAbsis(3);       // Menghubah absis Titik T1 dengan nilai 3
        T1.setOrdinat(4);     // Menghubah ordinat Titik T1 dengan nilai 4
        T1.printTitik();        // Mencetaak Koordinat Titik ke layar
        T1.geser(3,4);     // Menggeser T1 sejauh (3,4)
        T1.printTitik();        // Mencetaak Koordinat Titik ke layar

        // object reference
        System.out.println("\noverloading construktor");
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        // titik T2 ikut berubah meskiput yg diubah T1
        // alasannya T2 referensi langsung ke T1 tanpa buat new (alamatnya gk baru)

        // overloading construktor
        // di mana sebuah class memiliki lebih dari satu constructor dengan nama yang sama, tetapi memiliki daftar parameter yang berbeda.
        System.out.println("\noverloading construktor");
        Titik T3 = new Titik(9,5,8);
        T3.printTitik();

        // Static artibut & method
        // artibut yg kerja di main itu gk berubah (nempel ke class) 
        // gak ada setter tapi ada getter

        // kenapa pakai static?
        // ketika kita ingin variable yang gk berubah ubah

        System.out.println("\nStatic artibut & method");
        System.out.println("counter Titik : " + Titik.getCounterTitik());

        // kenapa 2?
        // karena T2 itu cmn reference ke T1 bkn buat baru

        // Keword this
        // This ini manggil dirinya sendiri
        // penggunaan nya biasanya di bodynya

        // Finalisasi Method
        System.out.println("\nFinalisasi Method");
        System.err.println("\ncari kuadran titik T1 : " + T1.getKuadran());
        System.err.println("cari jarak antara titik T1 dan titik T3 : " + T1.getJarak(T3));
        System.err.println("cari jarak antara titik T3: " + T3.getJarakPusat());

        T1.refleksiX();
        System.err.println("\nrefkesi X titik T1: ");
        T1.printTitik();

        T2.refleksiY();
        System.err.println("refkesi Y titik T1: ");
        T2.printTitik();

        System.out.println("/nget Refleks`i");
        Titik T4 = T3.getRefleksiX();
        T4.printTitik();

        Titik T5 = T3.getRefleksiY();
        T5.printTitik(); 
        




    }
}