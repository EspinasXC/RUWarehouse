package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile("restock.in");
        StdOut.setFile("restock.out");

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

            if(direction.equals("restock")){
                int id2 = StdIn.readInt();
                int stock2 = StdIn.readInt();
                storage.restockProduct(id2, stock2);
            }
            }
            StdOut.println(storage);
        }
}

