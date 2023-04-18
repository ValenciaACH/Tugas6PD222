package arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] bs = new String[5][4];
        double jumlahBarang, jumlahBelanjaan, harga, total, grandTotal, uang, kembalian;
        grandTotal = 0;

        try{
            System.out.print("Nama Pembeli : ");
            String nim = br.readLine();

            for (int i = 0; i < bs.length; i++) {
                System.out.print("Nama Barang : ");
                bs[i][0] = br.readLine();
                System.out.print("Jumlah : ");
                bs[i][1] = br.readLine();
                jumlahBarang = Double.parseDouble(bs[i][1]);
                System.out.print("Harga : ");
                bs[i][2] = br.readLine();
                harga = Double.parseDouble(bs[i][2]);

                total = jumlahBarang * harga;
                bs[i][3] = String.valueOf(total);
                System.out.println("Total = " + bs[i][3]);

                grandTotal = grandTotal + total;
                System.out.println("-----------------");

            }
            System.out.println("Grad Total (jumlahBarang * harga) = " + grandTotal);

            System.out.print("Jumlah uang yang diberikan oleh pembeli: ");
            uang = Double.parseDouble(br.readLine());
            kembalian = uang - grandTotal;
            System.out.print("Kembalian yang diberikan kepada pembeli adalah " + kembalian);

        }catch (Exception e){


        }

    }
}
