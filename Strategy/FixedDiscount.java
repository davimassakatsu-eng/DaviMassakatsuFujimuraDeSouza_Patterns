public class FixedDiscount implements DiscountStrategy {
    private final double amount;

    public FixedDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("O desconto fixo não pode ser negativo.");
        }
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        return Math.max(0.0, subtotal - amount);
    }
}
