/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116380.zainachmadrizqullah.no3;

/**
*NAMA   : ZAIN ACHMAD RIZQULLAH
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : UNTUK MENAMPILKAN GENRE MUSIK DAN MUSISINYA
 */
public class Rnb extends MusicGenre implements Blues, Jazz{
    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName+" adalah musisi Blues");
    }

    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName+" adalah musisi Jazz");
    }
}
