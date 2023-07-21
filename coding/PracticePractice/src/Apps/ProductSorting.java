package Apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products {
    private int pid;
    private String pname;

    public Products(int pid, String pname) {
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

public class ProductSorting {
	public static void main(String[] args) {
        
        List<Products> productList = new ArrayList<>();
        productList.add(new Products(1, "Ship"));
        productList.add(new Products(2, "Sun"));
        productList.add(new Products(3, "Sarah"));
        productList.add(new Products(4, "Hunter"));
        productList.add(new Products(5, "Sea"));
        productList.add(new Products(6, "Hetmeyer"));

        
        Collections.sort(productList, new Comparator<Products>() {
            @Override
            public int compare(Products p1, Products p2) {
                return p2.getPname().compareToIgnoreCase(p1.getPname());
            }
        });

        for (Products products : productList) {
            System.out.println(products);
        }
    }

   

}
