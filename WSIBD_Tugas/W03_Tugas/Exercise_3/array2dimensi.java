/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W03_Tugas.Exercise_3;

/**
 *
 * @author Dell
 */
public class array2dimensi {

    public static void main(String[] args) {
        int[][] angkarray = {{5, 6, 1, 7}, {8, 1, 2, 9}, {5, 4, 7, 1}, {8, 3, 7, 5}};
        for (int kanan = 0; kanan < 4; kanan++) {
            for (int bawah = 0; bawah < 4; bawah++) {
                System.out.print(angkarray[kanan][bawah] + "  ");
            }
            System.out.println("");
        }
    }
}
