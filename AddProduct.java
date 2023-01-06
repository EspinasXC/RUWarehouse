package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {

        StdIn.setFile("addproduct.in");
        StdOut.setFile("addproduct.out");

        int x = StdIn.readInt();
        Warehouse storage = new Warehouse();
        
        //Will add a new product for each n
        for(int i = 0; i < x; i++){
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();

            storage.addProduct(id, name, stock, day, demand);
        }
        
        StdOut.print(storage);

    }
}
