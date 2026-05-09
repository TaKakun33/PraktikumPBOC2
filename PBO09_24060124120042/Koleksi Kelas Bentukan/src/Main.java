/* File        : Main.java
 * Deskripsi   : Aplikasi untuk mendemonstrasikan semua operator kelas Piaraan
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 9 Mei 2026
 */

public class Main {
    public static void main(String[] args) {

        // Inisialisasi objek Piaraan
        Piaraan p = new Piaraan();

        // Buat objek-objek Anabul
        Kucing k1 = new Kucing("Kucing Oranye", 3.5);
        Kucing k2 = new Kucing("Kucing Hitam", 4.2);
        Anggora ang = new Anggora("Anggora Putih", 5.0);
        KembangTelon kt = new KembangTelon("KembangTelon Belang", 3.8);
        Anjing anj = new Anjing("Anjing Coklat");
        Burung b = new Burung("Burung Hijau");

        // Set panggilan masing-masing
        k1.setPanggilan("Oyen");
        k2.setPanggilan("Hitam");
        ang.setPanggilan("Anggi");
        kt.setPanggilan("Telon");
        anj.setPanggilan("Doggo");
        b.setPanggilan("Pipit");

        // enqueueAnabul
        p.enqueueAnabul(k1);
        p.enqueueAnabul(anj);
        p.enqueueAnabul(ang);
        p.enqueueAnabul(b);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(kt);

        // getNbelm
        System.out.println("Jumlah anabul dalam antrean: " + p.getNbelm());

        // showAnabul
        System.out.println("\nDaftar panggilan anabul (showAnabul):");
        p.showAnabul();

        // isMember
        System.out.println("\nisMember(k1): " + p.isMember(k1));
        System.out.println("isMember(new Anjing(\"X\")): " + p.isMember(new Anjing("X")));

        // getAnabul
        System.out.println("\nAnabul pertama (getAnabul): " + p.getAnabul().getPanggilan());

        // countKucing
        System.out.println("\nJumlah keluarga Kucing: " + p.countKucing());

        // bobotKucing
        System.out.println("Total bobot Kucing: " + p.bobotKucing());

        // showJenisAnabul
        System.out.println("\nDaftar panggilan dan jenis anabul (showJenisAnabul):");
        p.showJenisAnabul();

        // dequeueAnabul
        System.out.println("\nDequeue anabul pertama: " + p.dequeueAnabul().getPanggilan());
        System.out.println("Jumlah anabul setelah dequeue: " + p.getNbelm());
        System.out.println("Anabul pertama sekarang: " + p.getAnabul().getPanggilan());
    }
}