/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415.latihan32.daftarfilm;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Daftar Film
 */
public class PBO0210116415LATIHAN32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=== Daftar Film Sedang Tayang ===");
       
       film film1 = new film();
       film1.filmName = "Venom";
       film1.filmGenre = "Action, Horror, Scifi";
       film1.filmRating = 8.5;
       film1.filmDuration = 120;
       film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating, 
               film1.filmDuration);
       
       film film2 = new film();
       film2.filmName = "Small Foot";
       film2.filmGenre = "Animation";
       film2.filmRating = 9.0;
       film2.filmDuration = 96;
       film.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating, 
               film2.filmDuration);
       film film3 = new film();
       film3.filmName = "Carzy Rich Asia";
       film3.filmGenre = "Comedy";
       film3.filmRating = 7.8;
       film3.filmDuration = 119;
       film.nowPlaying(film3.filmName, film3.filmGenre, film3.filmRating, 
               film3.filmDuration);
       film film4 = new film();
       film4.filmName = "Asih";
       film4.filmGenre = "Horror";
       film4.filmRating = 6.0;
       film4.filmDuration = 100;
       film.nowPlaying(film4.filmName, film4.filmGenre, film4.filmRating, 
               film4.filmDuration);
    }
    
}
