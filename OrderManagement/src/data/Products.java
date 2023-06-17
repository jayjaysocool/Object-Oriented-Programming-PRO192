
package data;


public class Products {

    private String productID;
    private String productName;
    private String unit;
    private String orgin;
    private double price;

    public Products(String productID, String productName, String unit, String orgin, double price) {
        this.productID = productID;
        this.productName = productName;
        this.unit = unit;
        this.orgin = orgin;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("|%-4s|%-20s|%-35s|%-25s|%-7.3f|\n",
                 productID, productName, unit, orgin, price);
    }

    public void showInfor() {
        System.out.printf("|%-4s|%-25s|%-35s|%-25s|%-7.3f|\n",
                 productID, productName, unit, orgin, price);
    }

}
