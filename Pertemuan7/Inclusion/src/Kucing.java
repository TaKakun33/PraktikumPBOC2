/* File        : Kucing.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Kucing sebagai Child)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class Kucing extends Anabul{

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Kucing
    public Kucing(String nama) {
        super(nama); 
    }

    // Method Gerak pada Burung 
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    // Method Bersuara pada Burung 
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi meong.");
    }
}
