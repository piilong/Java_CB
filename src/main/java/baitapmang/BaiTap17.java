package baitapmang;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class BaiTap17 {

    public static void main (String[] args) {
        //khai bao mang luu so nguyen
        double [] a;
        int n;
        Scanner sc = new Scanner(System.in);
        //Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();
        //cap phat so phan tu cho mang
        a = new double[n];
        //Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);
        //a.xuat mang ra man hinh
        System.out.println("\nMang so thuc:  ");
        xuatMang(a);
        //b.Tinh tong mang
        double tb =  tinhTb(a);
        System.out.print("\nGia tri trung binh:" + tb);

        double min = timMin(a);
        System.out.print("\nPhan tu nho nhat:" + min);
    }
    //dinh nghia phuong thuc nhap mang

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    //dinh nghia phuong thuc xuat mang

    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
    }

    //dinh nghia phuong thuc dem phan duong le
    public static int tinhTb(double[] a) {
    double sum = 0;
    for (double x : a) {
        sum += x; 
    }
    double average = sum / a.length;
    return (int) average;
}


    public static int timMin(double[] a) {
        //d.Tim phan tu lon nhat cua mang
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return (int) min;
    }
   
}
