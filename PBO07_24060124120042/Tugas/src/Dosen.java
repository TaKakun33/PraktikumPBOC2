/* File        : Dosen.java
 * Deskripsi   : Kelas turunan Dosen dengan atribut NIP
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class Dosen extends CivitasAkademika {

    /**** Atribut ****/
    String NIP;

    /**** Method ****/
    // Konstruktor tanpa parameter
    public Dosen() {
        super();
        this.NIP = "-999";
    }

    // Konstruktor dengan parameter
    public Dosen(String NIP, String Nama) {
        super(Nama);
        this.NIP = NIP;
    }

    // Getter NIP
    public String getNIP() {
        return NIP;
    }

    // Untuk mengembalikan NIP (Overiding / Inclusion)
    @Override
    public String getNomor() {
        return NIP;
    }
}