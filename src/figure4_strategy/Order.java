package figure4_strategy;

public class Order {
    private Shipping shipping;

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public double getShippingCost() {
        return shipping.getCost();
    }
}
