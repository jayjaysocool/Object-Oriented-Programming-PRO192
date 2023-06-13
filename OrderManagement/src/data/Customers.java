package data;

public class Customers {

    private String customerID;
    private String customerName;
    private String customerAddress;
    private String customerphone;

    public Customers(String customerID, String customerName, String customerAddress, String customerphone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerphone = customerphone;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    @Override
    public String toString() {
        return String.format("|%-4s|%-20s|%-35s|%-25s|\n",
                customerID, customerName, customerAddress, customerphone);
    }

    public void showInfor() {
        System.out.printf("|%-4s|%-20s|%-35s|%-25s|\n",
                customerID, customerName, customerAddress, customerphone);
    }

}
