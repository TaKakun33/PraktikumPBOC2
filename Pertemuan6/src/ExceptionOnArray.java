/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 * */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}