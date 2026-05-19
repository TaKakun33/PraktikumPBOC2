/* File        : Mahasiswa.java
 * Deskripsi   : Kelas turunan Mahasiswa dengan atribut NIM dan Dosenwali
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class Mahasiswa extends CivitasAkademika {

    /**** Atribut ****/
    String NIM;
    Dosen Dosenwali;

    /**** Method ****/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        super();
        this.NIM = "-999";
        this.Dosenwali = null;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String NIM, String Nama) {
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = null;
    }

    // Getter NIM
    public String getNIM() {
        return NIM;
    }

    // untuk mengembalikan NIM (Overide / Inclusion)
    @Override
    public String getNomor() {
        return NIM;
    }

    // Untuk mengubah dosenwali dengan parameter objek Dosen
    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen;
    }

    // Untuk menampilkan NIM, Nama, Nama Dosenwali
    public void tampilDataMahasiswa() {
        String namaDosenwali = (Dosenwali != null) ? Dosenwali.getNama() : "Belum ada";
        System.out.println("NIM        : " + this.NIM);
        System.out.println("Nama       : " + this.Nama);
        System.out.println("Dosenwali  : " + namaDosenwali);
    }
}