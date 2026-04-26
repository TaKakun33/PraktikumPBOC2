/* File        : Seminar.java
 * Deskripsi   : Kelas aplikator Seminar dengan array statis peserta (maks 100)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class Seminar {

    /**** Atribut ****/
    CivitasAkademika[] pesertas;    
    int banyakpeserta;              

    /**** Method ****/
    // Konstruktor - banyakpeserta diinisialisasi nol
    public Seminar() {
        this.pesertas = new CivitasAkademika[100]; // kapasitas maks 100
        this.banyakpeserta = 0;
    }

    // Untuk menghitung banyaknya peserta seminar
    public int countPeserta() {
        return banyakpeserta;
    }

    // Untuk menambah peserta, elemen selalu kontigu
    public void registrasi(CivitasAkademika civitas) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = civitas;
            banyakpeserta++;
        } else {
            System.out.println("Seminar penuh! Kapasitas maksimal 100 orang.");
        }
    }

    // Untuk menampilkan Nomor dan Nama semua peserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar : ");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". " + pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    // Untuk menghitung peserta bertipe Mahasiswa (instanceof)
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}