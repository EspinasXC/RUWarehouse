package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile("deleteproduct.in");
        StdOut.setFile("deleteproduct.out");

        int x = StdIn.readInt();
        Warehouse storage = new Warehouse();
        
        for(int i = 0; i < x; i++){
            String direction = StdIn.readString();

            if(direction.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                storage.addProduct(id, name, stock, day, demand);
            }

            if(direction.equals("delete")){
                int id2 = StdIn.readInt();
                storage.deleteProduct(id2);
            }
            }
            StdOut.print(storage);
	// Use this file to test deleteProduct
    }
}
