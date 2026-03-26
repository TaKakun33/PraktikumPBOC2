/* File       : MBangunDatar.java
 * Deskripsi  : Main dari class BangunDatar, Persegi, Lingkaran serta interface IResize (Abstrak dan interface)
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args) {

        // Tidak bisa karena ini abstrack
        // BangunDatar B1 = new BangunDatar();

        BangunDatar P1 = new Persegi(10, "kuning", "hitam");
        Persegi P2 = new Persegi(10, "biru", "hitam");
        BangunDatar L1 = new Lingkaran(10, "hitam", "merah");
        Lingkaran L2 = new Lingkaran (10, "hitam", "jingga");

        // Cek isEqualLuas
        System.err.println("isEqualLuas P1 dan L1 = " + P1.isEqualLuas(L1));
        System.err.println("isEqualLuas P1 dan P2 = " + P1.isEqualLuas(P2));
        System.err.println("isEqualLuas L1 dan L2 = " + L1.isEqualLuas(L2));

        // Cek isEqualKeliling
        System.err.println("\nisEqualKeliling P1 dan L1 = " + P1.isEqualKeliling(L1));
        System.err.println("isEqualKeliling P1 dan P2 = " + P1.isEqualKeliling(P2));
        System.err.println("isEqualKeliling L1 dan L2 = " + L1.isEqualKeliling(L2));

        // cek IResize
        P2.zoomIn();
        System.err.println("\nSisi habis ZoomIN dari P2 = " + P2.getSisi());   
        
        L2.zoomOut();
        System.err.println("Sisi habis ZoomOut dari L2 = " + L2.getJari());   

        ((Persegi)P1).zoom(130);
        System.err.println("Sisi habis Zoom 130% dari P1 = " + ((Persegi)P1).getSisi());   


    }
}
