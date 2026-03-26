/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 */

public class Asersi1 {
    public static void main(String[] args) throws Exception {
        int x = 0;
        
        if (x > 0){
            System.err.println("X bilangan positif");
        } else {
            assert (x < 0) : "Ada Kesalahan kode";
            System.err.println("X bilangan negatif");
        }
    }
}
