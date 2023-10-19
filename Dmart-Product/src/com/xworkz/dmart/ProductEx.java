package com.xworkz.dmart;

import com.xworkz.dmart.dmart.DMart;
import com.xworkz.dmart.product.Product;
import java.util.Scanner;

public class ProductEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of dmarts to be added");
        int size;
        size = sc.nextInt();
        DMart dmart=new DMart(size);

        for (int index = 0; index < size; index++) {
            Product product = new Product();

            System.out.println("enter the name");
            product.setName(sc.next());
            System.out.println("enter the expired date");
            product.setExpiredDate(sc.next());
            System.out.println("enter the manufacture date");
            product.setManufacturingDate(sc.next());
            System.out.println("enter the price");
            product.setPrice(sc.nextInt());
            System.out.println("enter thr weight in gms");
            product.setWeightInGms(sc.nextInt());
            System.out.println("enter the ingredients");
            product.setIngredients(sc.next());
            System.out.println("enter the Company name");
            product.setCompanyName(sc.next());
            System.out.println("enter the bar code");
            product.setBarCode(sc.nextLong());
            dmart.AddProducts(product);

        }
        dmart.getAllProducts();

        String input=null;

        do{
            System.out.println("press 1 : to get details");
            System.out.println("press 2 : to get details");
            System.out.println("press 3 : to get details");
            System.out.println("press 4 : to get details");
            System.out.println("press 5 : to get details");
            System.out.println("press 6 : to get details");
            System.out.println("press 7 : to get details");
            System.out.println("press 8 : to get details");

            int options= sc.nextInt();
            switch (options)
            {
                case 1 :
                    dmart.getAllProducts();
                    break;

                case 2 :
                    System.out.println("enter the id");
                    String name = dmart.getNameById(sc.nextInt());
                    System.out.println(name);
                    break;

                case 3:
                    System.out.println("enter the name");
                    String officerName=dmart.getInfoById(sc.next());
                    System.out.println(officerName);
                    break;

                case 4:
                    System.out.println("enter the name");
                    int barCode=dmart.getproductBarCodeByName(sc.next());
                    System.out.println(barCode);
                    break;

                case 5:
                    System.out.println("enter the company name");
                    String name1 = dmart.getCompanyNameByName(sc.next());
                    System.out.println(name1);
                    break;

                case 6:
                    System.out.println("enter the id");
                    String ingredients=dmart.getIngredientsById(sc.nextInt());
                    System.out.println(ingredients);
                    break;

                case 7:
                    System.out.println("enter the name");
                    int price=dmart.getproductPriceByName(sc.next());
                    System.out.println(price);
                    break;

                case 8:
                    System.out.println("enter the company name");
                    int id=dmart.getproductWeightByCName(sc.next());
                    System.out.println(id);
                    break;

                case 9:
                    System.out.println("enter the product name");
                    boolean pName=dmart.updateCNameByProductName(sc.next(), sc.next());
                    System.out.println(pName);

                case 10 :
                    System.out.println("enter the name of product");
                    int deleteProduct=dmart.deleteProductById(sc.nextInt());
                    System.out.println(deleteProduct);


                default:
                    System.out.println("please choose the correct options");
                    break;
            }
            System.out.println("do u want to continue yes/no");
            input = sc.next();
        }
        while(input.equals("yes"));
        System.out.println("tqww.....for using the app");
    }
}

