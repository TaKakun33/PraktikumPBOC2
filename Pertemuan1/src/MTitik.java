/* File       : MTitik.java 
 * Deskripsi  : Berisi artibut dan method dalam class titik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 19 Februari 2026 
 */

public class MTitik{
    public static void main(String[] args) {
        Titik T1 = new Titik();  // Membuat objek Titik T1 (0,0)
        T1.setAbsis(3);       // Menghubah absis Titik T1 dengan nilai 3
        T1.setOrdinat(4);     // Menghubah ordinat Titik T1 dengan nilai 4
        T1.printTitik();        // Mencetaak Koordinat Titik ke layar
        T1.geser(3,4);     // Menggeser T1 sejauh (3,4)
        T1.printTitik();        // Mencetaak Koordinat Titik ke layar
    }
}