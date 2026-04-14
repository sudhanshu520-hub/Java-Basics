public class ProductBilling {

    //Method 1: Billing for onre product 
    void bill(int price){
        System.out.print("Billing of one product" +price);

    }

    //Method 2: Billing for two product
    void bill(int price1,int price2){
        
        System.out.print("Billing of two product" +(price1 + price2));

    }
    //Mehod 3: Billing for three product
    void bill(int price1,int price2, int price3){
        
        System.out.print("Billing of three product" +(price1 + price2 + price3 ));

    }
    public static void main(String[] arg){
        ProductBilling pb = new ProductBilling();

        //call Overload methods 
        pb.bill(200);
        
        pb.bill(200,500);
        
        pb.bill(200,600,200);
    }
    
}
