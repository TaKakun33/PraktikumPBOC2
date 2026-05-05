/* File        : MMahasiswa.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Main Program)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class MAnabul {
    public static void main(String[] args) throws Exception {
        
        // Untuk Anabul (Parent)
        Anabul A = new Anabul("Rocky");
        System.out.println(A.getNama());
        A.Bersuara();
        A.Gerak();
        System.out.println();

        // Untuk Kucing (Child)
        Anabul K = new Kucing("Oyen");
        System.out.println(K.getNama());
        K.Bersuara();
        K.Gerak();
        System.out.println();

        // Untuk Anjing (Child)
        Anabul AJ = new Anjing("Backy");
        System.out.println(AJ.getNama());
        AJ.Bersuara();
        AJ.Gerak();
        System.out.println();

        // Untuk Burung (Child)
        Anabul B = new Burung("Bady");
        System.out.println(B.getNama());
        B.Bersuara();
        B.Gerak();
        
    }
}
