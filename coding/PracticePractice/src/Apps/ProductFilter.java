package Apps;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int pid;
    private String pname;

    public Product(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + "]";
    }
}

public class ProductFilter {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Ship"));
        productList.add(new Product(2, "Sun"));
        productList.add(new Product(3, "Sarah"));
        productList.add(new Product(4, "Hunter"));
        productList.add(new Product(5, "Sea"));
        productList.add(new Product(6, "Hetmeyer"));

        
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPname().toLowerCase().startsWith("s")) {
                filteredProducts.add(product);
            }
        }

        
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }

}


