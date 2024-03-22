package main;

public class SalesRecord {
    private int amountSold;
    private double productPrice;
    private Discount discount;

    public SalesRecord(int quantity, double price) {
        this.amountSold = quantity;
        this.productPrice = price;
        this.discount = new Discount();
    }


    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public static class Discount {
        private boolean theresDiscount;
        private double discountValue;

        public Discount() {
            this.theresDiscount = false;
            this.discountValue = 0.0;
        }

        public boolean isThereDiscount() {
            return theresDiscount;
        }

        public void setTheresDiscount(boolean theresDiscount) {
            this.theresDiscount = theresDiscount;
        }

        public double getDiscountValue() {
            return discountValue;
        }

        public void setDiscountValue(double discountValue) {
            this.discountValue = discountValue;
        }
    }
}
