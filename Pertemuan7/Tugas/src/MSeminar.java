/* File        : MSeminar.java
 * Deskripsi   : Program utama - demo Seminar dengan 2 Dosen dan 5 Mahasiswa
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class MSeminar {

    public static void main(String[] args) {

        /******** membuat 2 objek Dosen dan 5 objek Mahasiswa ********/
        Dosen d1 = new Dosen("196902141994032001", "Dr. Budi Rosalia");
        Dosen d2 = new Dosen("196902141994032002", "Dr. Siti sugeng Rahayu");

        Mahasiswa m1 = new Mahasiswa("24060124120041", "Akmal GPT");
        Mahasiswa m2 = new Mahasiswa("24060124120042", "Akka Mendoan");
        Mahasiswa m3 = new Mahasiswa("24060124120043", "Kapal Ferri");
        Mahasiswa m4 = new Mahasiswa("24060124120044", "Eka Putri");
        Mahasiswa m5 = new Mahasiswa("24060124120045", "Engga nur");

        /******** Registrasi 7 peserta ke Seminar ********/
        Seminar seminar = new Seminar();

        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        /******** countPeserta ********/
        System.out.println("===== Jumlah Peserta =====");
        System.out.println("Total peserta: " + seminar.countPeserta());

        /******** tampilPeserta ********/
        System.out.println("\n===== Tampil Peserta =====");
        seminar.tampilPeserta();

        /******** countMahasiswa ********/
        System.out.println("\n===== Jumlah Peserta Mahasiswa =====");
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        /******** setWali - ubah dosenwali tiap mahasiswa ********/
        System.out.println("\n===== Set Dosenwali =====");
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d2);
        System.out.println("Dosenwali berhasil di-set.");

        /******** tampilDataMahasiswa ********/
        System.out.println("\n===== Data Mahasiswa =====");
        m1.tampilDataMahasiswa();
        System.out.println();

        m2.tampilDataMahasiswa();
        System.out.println();

        m3.tampilDataMahasiswa();
        System.out.println();

        m4.tampilDataMahasiswa();
        System.out.println();

        m5.tampilDataMahasiswa();
    }
}