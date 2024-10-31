import java.util.Scanner;

public class SearchNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNilai = new int[10];
        int key, n;
        int hasil = 0;

        System.out.print("Masukkan nilai yang akan diinput: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println("Nilai " + key + " ,merupakan nilai mahasiswa ke-" + (hasil+1));
                break;
            } else if (key != arrNilai[i] && i==(arrNilai.length-1)){
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
        }
        
        
    }
}
