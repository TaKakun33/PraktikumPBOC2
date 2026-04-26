/* File        : MMahasiswa.java
 * Deskripsi   : POLIMORFISME AD HOC OVERLOADING (Main Program)
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        
        // mahasiswa default
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("mahasiswa default");
        mhs1.cetakInfo();
        System.out.println();

        // mahasiswa berisi
        Mahasiswa mhs2 = new Mahasiswa("24060124120042", "Fulan", "Informatika");
        System.out.println("mahasiswa berisi");
        mhs2.cetakInfo();
        System.out.println();

        // Mahasiswa Kloning dari mhs2
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        System.out.println("Hasil Kloning dari mhs2: ");
        mhs3.cetakInfo();
        System.out.println();

        // aplikasi semua varian operator setProgramStudi        
        System.out.println("\nKondisi awal mhs1:");
        mhs1.cetakInfo();
        
        // Menggunakan Varian 1 (Tanpa parameter)
        mhs1.setProgramStudi();
        System.out.print("\nsetProgramStudi() : ");
        mhs1.cetakInfo();

        // Menggunakan Varian 2 (Parameter String)
        mhs1.setProgramStudi("Sistem Informasi");
        System.out.print("\nsetProgramStudi(String) : ");
        mhs1.cetakInfo();

        // Menggunakan Varian 3 (Parameter Objek)
        // Mengambil Program Studi dari mhs2 dan menerapkannya ke mhs1
        mhs1.setProgramStudi(mhs2); 
        System.out.print("\nsetProgramStudi(Mahasiswa): ");
        mhs1.cetakInfo();
    }
}