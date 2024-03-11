public class ProductsSale { 
    private int quantity;
    private double price;

    public ProductsSale(int quantity, double price) { 
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) { 
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double totalAmount() { 
        return quantity * price;
    }

    public double calculateChange(double amountReceived) { 
        return amountReceived - price;
    }
}
