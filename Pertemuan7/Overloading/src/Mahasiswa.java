/* File        : Mahasiswa.java
 * Deskripsi   : POLIMORFISME AD HOC OVERLOADING (Class Mahasiswa)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

class Mahasiswa {
    /**** Artibut ****/
    String NIM;
    String Nama;
    String Programstudi;

    /**** Method ****/
    // Konstruktor tanpa parameter (Default)
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // Konstruktor dengan tiga parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // Konstruktor dengan parameter objek (Overloading Konstruktor)
    public Mahasiswa(Mahasiswa mhsLain) {
        this.NIM = mhsLain.NIM;
        this.Nama = mhsLain.Nama;
        this.Programstudi = mhsLain.Programstudi;
    }

    // Operator setProgramStudi dengan tanpa parameter
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    // Operator setProgramStudi dengan parameter String
    public void setProgramStudi(String programStudiBaru) {
        this.Programstudi = programStudiBaru;
    }

    // Operator setProgramStudi dengan parameter objek
    public void setProgramStudi(Mahasiswa mhsLain) {
        this.Programstudi = mhsLain.Programstudi;
    }

    // Untuk cetak informasi terkait artibut objek
    public void cetakInfo() {
        System.out.println("NIM: " + this.NIM + " \nNama: " + this.Nama + " \nProgram Studi: " + this.Programstudi);
    }
}