public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000.0, 2, "siyah");
        /*product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000.0);
        product.setStockAmount(3);
        product.setRenk("mavi");
        System.out.println(product.getName());*/

        System.out.println(product.getKod());


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}