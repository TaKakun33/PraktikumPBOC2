/* File        : Anjing.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Anjing sebagai Child)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class Anjing extends Anabul{

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Anjing
    public Anjing(String nama) {
        super(nama); 
    }

    // Method Gerak pada Anjing 
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    // Method Bersuara pada Anjing
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi guk-guk.");
    }
}
