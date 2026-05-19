/* File        : Burung.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Burung sebagai Child)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 5 mei 2026
 */

public class Burung extends Anabul {

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Burung
    public Burung(String nama) {
        super(nama); 
    }

    // Method Gerak pada Burung 
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    // Method Bersuara pada Burung 
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi cuit.");
    }
}
