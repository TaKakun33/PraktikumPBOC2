/* File        : MainTeman.java
 * Deskripsi   : Aplikasi untuk mendemonstrasikan semua operator kelas Teman
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 9 Mei 2026
 */
public class Main {
    public static void main(String[] args) {

        // INISIALISASI OBJEK TEMAN 
        Teman t = new Teman();

        // addNama  
        t.addNama("Budi");
        t.addNama("Ani");
        t.addNama("Citra");
        t.addNama("Budi");   
        t.addNama("Doni");

        // showTeman
        System.out.println("\nDaftar Teman");
        t.showTeman();

        // getNbelm 
        System.out.println("\nJumlah teman: " + t.getNbelm());

        // getNama 
        System.out.println("\nNama pada indeks 0: " + t.getNama(0));
        System.out.println("Nama pada indeks 2: " + t.getNama(2));

        // setNama 
        System.out.println("\nSebelum setNama(1): " + t.getNama(1));
        t.setNama(1, "Anisa");
        System.out.println("Sesudah setNama(1, \"Anisa\"): " + t.getNama(1));

        // isMember 
        System.out.println("\nisMember(\"Citra\"): " + t.isMember("Citra"));
        System.out.println("isMember(\"Zara\"): " + t.isMember("Zara"));

        // gantiNama 
        System.out.println("\nSebelum gantiNama(\"Doni\" -> \"Dono\"):");
        t.showTeman();
        t.gantiNama("Doni", "Dono");
        System.out.println("Sesudah gantiNama:");
        t.showTeman();

        // countNama 
        System.out.println("\ncountNama(\"Budi\"): " + t.countNama("Budi"));
        System.out.println("countNama(\"Citra\"): " + t.countNama("Citra"));

        // delNama  
        System.out.println("\nSebelum delNama(\"Budi\"):");
        t.showTeman();
        t.delNama("Budi");

        System.out.println("\nSesudah delNama(\"Budi\") - semua Budi terhapus:");
        t.showTeman();
        System.out.println("Jumlah teman sekarang: " + t.getNbelm());
    }
}