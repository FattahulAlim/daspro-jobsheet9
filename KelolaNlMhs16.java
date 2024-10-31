import java.util.Scanner;

public class KelolaNlMhs16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int n, total=0;
        double tertinggi=0, terendah=100, rata2=0;

        System.out.print("Berapa Mahasiswa anda: ");
        n =sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        } rata2 = total/n;

        for (int i=0; i<n; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        for (int i=0; i<n; i++) {
            System.out.println("Nilai mahasiswa ke-" +(i+1)+ " adalah: " +nilaiMhs[i]);
        } System.out.println("Nilai rata rata = " + rata2);
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah = " + terendah);
    }
}
