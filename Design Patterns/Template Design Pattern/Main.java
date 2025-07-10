public class Main {
    public static void main(String[] args) {
        BeverageMaker tea = new TeaMaker();
        BeverageMaker coffee = new CoffeeMaker();

        System.out.println("Making tea:");
        tea.prepare();

        System.out.println("\nMaking coffee:");
        coffee.prepare();
    }
}
