/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter
 * pada method.
 */

import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaLMap = new HashMap<>();
        mahasiswaLMap.put("032","Akka");
        mahasiswaLMap.put("075","Rayyan");
        mahasiswaLMap.put("195","Ali");
        mahasiswaLMap.put("234","Basil");

        mahasiswaLMap.forEach((NIM, Nama) -> System.out.println(NIM + " : " + Nama));

    }

}
