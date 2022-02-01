public class Main {
    public static void main(String[] args) {
        Method method = new Method();
        FileManager file = new FileManager();
        System.out.println(method.findQuotientOfProductsOfEvenAndOdd(file.readNumberFromFile()));
    }
}
