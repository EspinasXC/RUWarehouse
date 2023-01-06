package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile("purchaseproduct.in");
        StdOut.setFile("purchaseproduct.out");
        
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

            if(direction.equals("purchase")){
                int day2 = StdIn.readInt();
                int id2 = StdIn.readInt();
                int amount2 = StdIn.readInt();
                
                storage.purchaseProduct(id2, day2, amount2);;
            }
            }
            StdOut.print(storage);
    }
}
