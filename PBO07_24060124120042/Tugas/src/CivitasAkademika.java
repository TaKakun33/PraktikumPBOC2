/* File        : CivitasAkademika.java
 * Deskripsi   : Kelas induk CivitasAkademika dengan atribut Nama dan fungsi getNomor
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public abstract class CivitasAkademika {

    /**** Atribut ****/
    String Nama;

    /**** Method ****/
    // Konstruktor tanpa parameter
    public CivitasAkademika() {
        this.Nama = "n/a";
    }

    // Konstruktor dengan parameter
    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    // Getter Nama
    public String getNama() {
        return Nama;
    }

    // Menyesuaikan tiap kelas anak (NIM atau NIP) Inclusion
    public abstract String getNomor();
}