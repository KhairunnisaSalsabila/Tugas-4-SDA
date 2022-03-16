package tugas4;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
    
        Queue<String> queueLine = new LinkedList<String>();

        queueLine.add("A");
        queueLine.add("B");
        queueLine.add("C");
        queueLine.add("D");
        queueLine.add("E");
        queueLine.add("F");
        queueLine.add("G");
        queueLine.add("H");

        System.out.println("--Antrean Coffee Shop--");
        System.out.println(queueLine);

        //POLL
        System.out.println("\n- Menghapus elemen menggunakan POLL");
        System.out.println("Customer ke-1 yang selesai memesan adalah " +queueLine.poll());
        System.out.println("Antrean setelah 1 orang selesai memesan\t:"+queueLine);

        //PEEK
        System.out.println("\n- Memanggil elemen di head menggunakan PEEK");
        System.out.println("Yang memesan selanjutnya adalah " +queueLine.peek());

        //POLL
        System.out.println("\n- Menghapus elemen menggunakan POLL");
        queueLine.poll();
        System.out.println("Maka kondisi antrian sekarang ialah "+queueLine);

        //REMOVE
        System.out.println("\n- Menghapus elemen menggunakan REMOVE");
        System.out.println("Customer yang batal memesan adalah "+queueLine.remove());
        System.out.println("Antrian setelah 1 customer sebelumnya batal memesan :"+queueLine);

        //ISEMPTY
        System.out.println("\n- Mengecek isi antrian menggunakan ISEMPTY");
        System.out.println("Apakah antrian sudah kosong? "+queueLine.isEmpty());

        //ELEMENT
        System.out.println("\n- Memanggil elemen head menggunakan ELEMENT");
        System.out.println("Yang berada di antrian paling awal sekarang adalah "+queueLine.element());
        
        //SIZE
        System.out.println("\n- Mengecek panjang antrian menggunakan SIZE");
        System.out.println("Panjang antrian di Starbucks sekarang adalah " +queueLine.size());

        //CLEAR
        System.out.println("\n- Menghapus isi queue menggunakan clear");
        queueLine.clear();

        //ISEMPTY
        System.out.println("- Mengecek antrian menggunakan ISEMPTY");
        System.out.println("Apakah antrian sudah kosong? "+queueLine.isEmpty());
        System.out.println("antrian pada pukul 22.00 :"+queueLine);


    }
    
}