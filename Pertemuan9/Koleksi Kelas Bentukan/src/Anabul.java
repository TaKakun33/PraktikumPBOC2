/* File        : Anabul.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Anabul sebagai Parent)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 9 Mei 2026
 */

public class Anabul {

    /**** Atribut ****/
    private String nama;
    private String panggilan;   // a. atribut panggilan

    /**** Method ****/
    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
        this.panggilan = nama;  // default panggilan = nama
    }

    // Getter nama
    public String getNama() {
        return this.nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter panggilan
    public String getPanggilan() {
        return this.panggilan;
    }

    // Setter panggilan
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // Method Gerak pada Anabul
    public void Gerak() {
        System.out.println(this.nama + " bergerak...");
    }

    // Method Bersuara pada Anabul
    public void Bersuara() {
        System.out.println(this.nama + " bersuara...");
    }
}