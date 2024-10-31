import java.util.Scanner;

public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double totalLls = 0, rataTdkLls=0,rataLulus=0, totalTdkLls=0;
        int n, lulus=0, tdkLulus=0;

        System.out.print("Berapa jumlah mahasiswa anda: ");
        n =sc.nextInt();
        
        for (int i = 0; i<n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++) {
            if (nilaiMhs[i] > 70) {
                totalLls += nilaiMhs[i];
                lulus++;
            } else {
                totalTdkLls += nilaiMhs[i];
                tdkLulus++;
            }
        } rataLulus += totalLls/lulus;
        rataTdkLls +=totalTdkLls/tdkLulus;

        System.out.println("Rata rata nilai lulus = " + rataLulus);
        System.out.println("Rata rata nilai tidak lulus = " + rataTdkLls);
       
    }
}
