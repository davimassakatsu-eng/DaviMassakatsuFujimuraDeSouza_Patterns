public class PercentageDiscount implements DiscountStrategy {
    private final double percent;

    public PercentageDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("O percentual deve estar entre 0 e 100.");
        }
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal) {
        return Math.max(0.0, subtotal * (1 - percent / 100.0));
    }
}
