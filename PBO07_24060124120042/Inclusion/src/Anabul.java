/* File        : Anabul.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Anabul sebagai Parent)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class Anabul {
    /**** Artibut ****/
    private String nama;

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Anabul
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengakses nama
    public String getNama() {
        return this.nama;
    }

    // Setter ntuk mengakses nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method Gerak pada anabul
    public void Gerak() {
        System.out.println(this.nama + " bergerak...");
    }

    // Method Bersuara pada anabul
    public void Bersuara() {
        System.out.println(this.nama + " bersuara...");
    }
}
