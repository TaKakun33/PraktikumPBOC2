/* File        : Anggora.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Anabul sebagai Parent)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 5 mei 2026
 */

public class Anggora extends Kucing{

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Kucing
    public Anggora(String nama,double bobot) {
        super(nama, bobot); 
    }

    // Method Gerak pada Anggora 
    @Override
    public void Gerak() {
        System.out.println(getNama() + " lincah melompat.");
    }

    // Method Bersuara pada Anggora 
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: meong lembut.");
    }
}
