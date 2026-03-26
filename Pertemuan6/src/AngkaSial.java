/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 * */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati dalam memasukkan angka!!!");
        }
    }

    /*
     * Ketika eksepsi terjadi, apakah baris 12 (14) pada AngkaSial.java di atas dieksekusi?
       Tidak, Karena ketika metode cobaAngka(13) dipanggil, kondisi pada baris 9 (11) bernilai true. Akibatnya, program mengeksekusi baris 10 (12).
       Begitu sebuah exception dilempar (throw), aliran eksekusi normal di dalam metode tersebut akan langsung dihentikan dan kendali program segera berpindah ke blok catch yang sesuai. 
       Oleh karena itu, baris 12 (14) dilompati dan tidak pernah dieksekusi untuk angka 13.   

     * Apakah baris 21 (23) pada AngkaSial.java di atas dieksekusi?
       Ya, Karena Ketika baris 19 (21) melempar pengecualian AngkaSialException, Java akan mencari penangan (handler) yang cocok. 
       Karena tipe eksepsi yang dilempar sesuai dengan parameter pada baris 21 (23), maka blok catch tersebut menjadi aktif.
    */
}