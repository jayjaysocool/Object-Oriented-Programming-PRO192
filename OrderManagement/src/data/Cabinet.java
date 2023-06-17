package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Cabinet {

    private List<Products> listProducts = new ArrayList<>();

    public List<Products> readProductsFromFile() {
        try {
            FileReader fr = new FileReader("products.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(",");
                String productID = txt[0];
                String productName = txt[1];
                String unit = txt[2];
                String orgin = txt[3];
                double price = Double.parseDouble(txt[4]);
                listProducts.add(new Products(productID, productName, unit, orgin, price));
            }

        } catch (Exception e) {
        }
        return listProducts;
    }

    public void printProducts() {
        
        List<Products> list = readProductsFromFile();
        for (Products products : list) {
            products.showInfor();
        }
        
    }
}
