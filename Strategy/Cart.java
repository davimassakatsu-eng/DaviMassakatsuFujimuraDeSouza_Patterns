public class Cart {
    private double subtotal;
    private DiscountStrategy strategy;

    public Cart(double subtotal, DiscountStrategy strategy) {
        if (subtotal < 0) {
            throw new IllegalArgumentException("O subtotal não pode ser negativo.");
        }
        setDiscountStrategy(strategy);
        this.subtotal = subtotal;
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("A estratégia não pode ser nula.");
        }
        this.strategy = strategy;
    }

    public double total() {
        return Math.max(0.0, strategy.apply(subtotal));
    }
}
