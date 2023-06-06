package paramArray;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class paramArray {
    //parameter : variavel tampung sementara di sebuah fungsi/prosedur
    //fungsi parameter array untuk meghintung rata-rata nilai (angka)
    public static int AvgArray(int[] data) {
        //deklarasi variabel tampung lain untuk memproses suatu perhitungan
        int jml = 0, rata = 0;
        //rata-rata (jumlah nilai/jumlah data)
        for (int i = 0; i < data.length; i++) {
            //penjumlahan nilai (1+1=2 +3=5 +1=6 +7=13 ..dst)
            jml += data[i];

        }
        rata = jml / data.length;
        return rata;
    }

        public static void terserah() throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d1[] = new int[3];
            for (int i = 0; i < d1.length; i++) {
                System.out.print("Masukkan Angka : ");
                d1[i] = Integer.parseInt(br.readLine());

            }
            System.out.println(AvgArray(d1));
        }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d[] = {1,2,4,7}; //data statis

        //data dinamis : data bisa dari inputan user
        int d1[] = new int[3];
        for (int i = 0; i < d1.length; i++) {
            System.out.print("Masukkan Angka : ");
            d1[i] = Integer.parseInt(br.readLine());

        }
        System.out.println(AvgArray(d1));

    }
}
