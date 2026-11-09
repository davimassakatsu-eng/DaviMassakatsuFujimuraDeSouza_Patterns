public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(200.0, new NoDiscount());
        System.out.println("Total (sem desconto): " + cart.total());

        // A estratégia é substituída durante a execução.
        cart.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("Total (10%): " + cart.total());

        // Nova troca: agora o desconto é um valor fixo.
        cart.setDiscountStrategy(new FixedDiscount(20));
        System.out.println("Total (-20): " + cart.total());
    }
}
