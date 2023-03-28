package bai1;

import java.util.Scanner;

import static bai1.ProductManager.*;

public class Main{
    public static void main(String[] args) {
        listProducts.add(new Product(1, "name1", 120));
        listProducts.add(new Product(2, "name2", 19));
        listProducts.add(new Product(3, "name3", 113));
        listProducts.add(new Product(4, "name4", 12));
        Scanner scanner=new Scanner(System.in);
        Menu();
        System.out.println("nhap lua chon");
        int n=scanner.nextInt();
        while (n!=0) {

            switch (n) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    editPro();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    sort(listProducts);
                    break;
                case 6:
                showProduct();
                break;
            }
            Menu();
            System.out.println("nhap lai lua chon");
            n=scanner.nextInt();
        }
    }
    public static void Menu(){
        System.out.println("1.them phan SP");
        System.out.println("2.xoa san pham");
        System.out.println("3.sua san pham");
        System.out.println("4.tim kiem san pham");
        System.out.println("5.sap xep theo gia sp tang dan");
        System.out.println("6.hien thi danh sach san pham");
        System.out.println("0.Thoat");
    }
}
