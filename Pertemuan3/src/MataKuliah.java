/* File       : MataKuliah.java
 * Deskripsi  : Berisi artibut dan method dalam class MataKuliah
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 5 Maret 2026 
 */

public class MataKuliah{
    /******** Variable ********/
    private String idMatKul;
    private  String nama;
    private int sks;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek MataKuliah tanpa parameter
    public MataKuliah() {
        this("", "", 0);
    }

    // Membuat objek MataKuliah dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    /* Getter */
    // Mengembalikan nilai idMatKul
    public String getIdMatKul() {
        return idMatKul;
    }

    // Mengembalikan nilai nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan nilai sks
    public int getSks() {
        return sks;
    }

    /* Setter */
    // Mengesset idMatKul dengan string idMatKul 
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // Mengesset nama dengan string nama 
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengesset sks dengan int sks 
    public void setSks(int sks) {
        this.sks = sks;
    }

    
    
}