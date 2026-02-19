/* File       : MTitik.java
 * Deskripsi  : Berisi artibut dan method dalam class titik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 19 Februari 2026 
 */

public class MTitik{
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik(); 
        T1.geser(3,4);
        T1.printTitik(); 
    }
}