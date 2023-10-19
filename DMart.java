package com.xworkz.dmart.dmart;

import com.xworkz.dmart.product.Product;
import java.util.Arrays;
public class DMart {

    Product product[];
    private java.lang.String String;

    public DMart(int size) {
        product = new Product[size];
    }

    int index;
    int id = 1;

    public boolean AddProducts(Product product) {
        System.out.println("invoke Add products");
        boolean isAdded = false;
        if (product != null) {
            product.setId(id++);
            this.product[index++] = product;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllProducts() {
        System.out.println("Product lists are");
        for (int index = 0; index < product.length; index++) {
            System.out.println(product[index].getId() + " " + product[index].getName()+ " " + product[index].getExpiredDate() + " " + product[index].getManufacturingDate() + " " + product[index].getPrice() + "    " + product[index].getWeightInGms() + "     " + product[index].getCompanyName() + "      " + product[index].getIngredients() + "     " + product[index].getCompanyName() + "          " + product[index].getBarCode());
        }
    }

    public String getNameById(int id) {
        String name = null;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getId() == id) {
                name = product[productIndex].getName();
                System.out.println("details  name found.... please collect it in executor");

            }
        }
        return name;
    }

    public String getInfoById(String name) {
        Product product1 = null;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getName() == name) {
                product1 = product[productIndex];
                System.out.println("details found.... please collect it in executor");
            }
        }
        return String;
    }

    public int getproductBarCodeByName(String productsName) {
        int barCode = 0;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getName() == productsName) {
                barCode = (int) product[productIndex].getBarCode();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return barCode;
    }

    public String getCompanyNameByName(String name) {
        String companyName = null;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getName() == companyName) {
                companyName = product[productIndex].getCompanyName();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return companyName;
    }

    public String getExpiryDateById(int productId) {
        String expiredDate = null;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getId() == productId) {
                expiredDate = product[productIndex].getExpiredDate();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return expiredDate;
    }

    public int getproductPriceByName(String name) {
        int price = 0;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getName() == name) {
                price = (int) product[productIndex].getPrice();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return price;
    }

    public int getproductWeightByCName(String Cname) {
        int weight = 0;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getName() == Cname) {
                weight = (int) product[productIndex].getWeightInGms();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return weight;
    }

    public String getIngredientsById(int productId) {
        String ingredients = null;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getId() == productId) {
                ingredients = product[productIndex].getIngredients();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return ingredients;
    }

    public boolean updateCNameByProductName(String updatedCName, String exisistingCName) {
        boolean isCNameUpdated = false;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getName() == exisistingCName) {
                product[productIndex].setCompanyName(updatedCName);
                isCNameUpdated = true;
            }
        }
        return isCNameUpdated;
    }

    public int deleteProductById(int id) {
        System.out.println("invoked deleteProductById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.product.length; index++) {
            if (product[index].getId() != id) {
                product[newIndex++] = product[index];
            } else {
                System.out.println("Given Name has been deleted from the list");
            }
        }
        product = Arrays.copyOf(product, newIndex);
        getAllNewApplication(product);
        return index;
    }

    public void getAllNewApplication(Product application[]) {
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(product[index].getId() + " " + product[index].getName() +"    " + product[index].getExpiredDate() + " " + product[index].getManufacturingDate() + " " + product[index].getPrice() + "    " + product[index].getWeightInGms() + "     " + product[index].getCompanyName() + "      " + product[index].getIngredients() + "     " + product[index].getCompanyName() + "          " + product[index].getBarCode());
        }
    }

}