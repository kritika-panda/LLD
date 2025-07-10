public class Main {
    public static void main(String[] args) {
        BeverageMaker tea = new TeaMaker();
        BeverageMaker coffee = new CoffeeMaker();

        System.out.println("Making tea:");
        tea.makeBeverage();

        System.out.println("\nMaking coffee:");
        coffee.makeBeverage();
    }
}
