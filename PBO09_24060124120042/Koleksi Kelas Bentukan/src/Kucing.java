/* File        : Kucing.java
 * Deskripsi   : POLIMORFISME AD HOC INCLUSION (Class Kucing sebagai Child)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 5 mei 2026
 */

public class Kucing extends Anabul{
    /**** Artibut ****/
    protected double bobot;

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Kucing
    public Kucing(String nama, double bobot) {
        super(nama); 
        this.bobot = bobot;
    }
    
    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public void printBobot(){
        System.out.println("Bobot :" + this.bobot);
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
