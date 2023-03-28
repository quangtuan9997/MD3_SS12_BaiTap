package bai1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class ProductManager extends Product {
    public static ArrayList<Product> listProducts=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    public static void addProduct(){
       int id;
       if(listProducts.size()==0){
           id=1;
       }else{
           id=listProducts.get(listProducts.size()-1).getProId()+1;
       }
        System.out.println("nhap ten");
        String name = scanner.next();
        System.out.println("nhap gia");
        int price = scanner.nextInt();
        Product product=new Product(id,name,price);
        listProducts.add(product);
        System.out.println("them thanh cong");
    }
    public  static void  showProduct(){
        System.out.println(listProducts);
    }
    public static void delete(){
        System.out.println("nhap Id san pham can xoa");
        int id=scanner.nextInt();
        for (int i=0;i<listProducts.size();i++){
            if (listProducts.get(i).getProId()==id){
                listProducts.remove(i);
                System.out.println("xoa thanh cong");
                return;
            }
        }
        System.out.println("khong co san pham nay");
    }
    public static void editPro(){
        System.out.println("nhap Id san pham can sua");
        int id=scanner.nextInt();
        for (int i=0;i<listProducts.size();i++){
            if (listProducts.get(i).getProId()==id){
                System.out.println("nhap gia san pham can sua");
                int price=scanner.nextInt();
                System.out.println("nhap ten san pham can sua");
                String name=scanner.next();
                listProducts.get(i).setProId(id);
                listProducts.get(i).setPrice(price);
                listProducts.get(i).setProName(name);
                System.out.println("sua thanh cong ");
                return;
            }
        }
        System.out.println("khong co san pham nay");
    }
    public static void search(){
        System.out.println("nhap ten Sp can tim kiem:");
        ArrayList<Product> listSearch=new ArrayList<>();
        String searchName=scanner.next();
        for (Product p : listProducts){
            if (p.getProName().contains(searchName)){
                listSearch.add(p);
            }
        }
        System.out.println(listSearch);
    }
    public static void sort(ArrayList product){
        Collections.sort(product);
    }
}
