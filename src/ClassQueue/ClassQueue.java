package ClassQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class ClassQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Membaca input dari pengguna dan memasukkannya ke dalam antrian
            System.out.println("Tambahkan Antrian (ketik 'selesai' untuk mengakhiri):");
            String input = reader.readLine();
            while (!input.equalsIgnoreCase("selesai")) {
                queue.add(input);
                input = reader.readLine();
            }

            // Menampilkan elemen-elemen dalam antrian
            System.out.println("Melihat Antrian : ");
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        } catch (IOException e) {
            e.printStackTrace();


            Queue<String> phonequeue = new LinkedList<>();

            // Menambahkan beberapa nama ke dalam antrian
            queue.add("Xiaomi");
            queue.add("Apple");
            queue.add("Samsung");
            queue.add("LG");

            // Menghapus dan menampilkan elemen pertama dalam antrian
            System.out.println("Saat ini yang dilayani: " + queue.poll());

            // Menampilkan sisa elemen dalam antrian
            System.out.println("Sisa antrian:");
            for (String name : queue) {
                System.out.println(name);
            }
        }
    }
}


