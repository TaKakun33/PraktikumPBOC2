/* File        : MMahasiswa.java
 * Deskripsi   : POLIMORFISME AD HOC COERSION 
 * NIM & Nama  : Akmal Kafi Anan - 24060124120042
 * Tanggal     : 26 April 2026
 */

public class MCorecion {
    public static void main(String[] args) throws Exception {
        
        /*** Bagian A ***/
        int nilaiAwal = 65;
        
        // coersion: int -> char
        char nilaiChar = (char) nilaiAwal; 
        
        // coersion: int -> double
        double nilaiReal = nilaiAwal; 

        
        System.out.println("Nilai sebagai integer  : " + nilaiAwal);
        System.out.println("Nilai sebagai karakter : " + nilaiChar);
        System.out.println("Nilai sebagai real     : " + nilaiReal);

        /*** Bagian B ***/

        // Real -> Integer (dimana awalnya dari integer -> Real)
        int integerDikembalikan = (int) nilaiReal; 
        System.out.println("Dikembalikan ke int " + integerDikembalikan);
         
        /*** Bagian C ***/

        // String X dan Y (1234 dan 5678)
        String X = "1234";
        String Y = "5678";

        // S = Hasil konkatenasi X dan Y
        String S = X + Y; 
        
        // Z = Hasil penjumlahan angka X dan Y
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("Hasil dari S (str + str) :" + S);
        System.out.println("Hasil dari Z (int + int) :" + Z);

        /*** Bagian D ***/

        // String P dan Q (12.34 dan 56.78)
        String P = "12.34";
        String Q = "56.78";
        
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        
        System.out.println("Hasil dari R (str + str) :" + R);
        System.out.println("Hasil dari D (int + int) :" + D);

        /*** Bagian E ***/

        // Objek Integer A dari hasil konversi S : String -> Integer
        Integer A = Integer.parseInt(S); 
        System.out.println("Hasil Integer A dari hasil konversi S :" +A);

        /*** Bagian F ***/

        // Objek String T dari hasil konversi A
        String T = A.toString(); 
        System.out.println("String T dari hasil konversi A :" + T);
        
    }
}
