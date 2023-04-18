package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class array2d {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi array 2D
        String[][] ips = new String[3][4];

        //karena array bertipe string, maka ada konversi tipe data ke int bagi data sks, bobot, total, jumlah sks, ip
        //menampung hasil konversi pada variabel
        //3.5 --> double
        double sks, bobot, totalBobot, jumlahSKS, grandTotal, ip;
        grandTotal = 0;

        try{
            //input data nim dan nama
            System.out.print("NIM : ");
            String nim = br.readLine();
            System.out.print("Nama : ");
            String nama = br.readLine();

            //input data MK (jumlah data MK > 1)
            for (int i = 0; i < ips.length; i++) {
                System.out.print("Nama MK : ");
                ips[i][0] = br.readLine();
                System.out.print("SKS : ");
                ips[i][1] = br.readLine();
                //konversi tipe data daro ips[i][1] (string) ke double
                sks = Double.parseDouble(ips[i][1]);
                System.out.print("Bobot : ");
                ips[i][2] = br.readLine();
                bobot = Double.parseDouble(ips[i][2]);

                //memasukkan perhitungan IPS
                totalBobot = sks * bobot;

                //total bobot per index
                //konversi dari numeric (int, double, dll) ke string --> String.value0f
                ips[i][3] = String.valueOf(totalBobot);
                System.out.println("Total = " + ips[i][3]);

                //hitung grandtotal
                grandTotal = grandTotal + totalBobot;
                System.out.println("--------");
            }

            System.out.println("Grad Total (SKS * Bobot) = " + grandTotal);
            //hitung IP
            System.out.print("Jumlah SKS yang diambil : ");
            jumlahSKS = Double.parseDouble(br.readLine());
            ip = grandTotal / jumlahSKS;
            System.out.print("IP anda semester ini adalah " + ip);

        }catch (Exception e){

        }
    }
}