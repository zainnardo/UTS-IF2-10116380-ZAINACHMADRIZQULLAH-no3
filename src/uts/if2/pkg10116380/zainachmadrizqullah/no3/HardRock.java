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
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PsychedelicRock{

    public void genreHardRock(String artistName) {
        System.out.println(artistName+" adalah musisi HardRock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName+" adalah musisi PsychedelicRock");
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName+" adalah musisi PopRock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName+" adalah musisi ProgressiveRock");
    }
}
