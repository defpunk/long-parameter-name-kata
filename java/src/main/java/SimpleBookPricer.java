public class SimpleBookPricer {

    public static double calculatePrice(String string, String string2, Book.Type type, double rrp, int i) {
        
        if(Book.Type.PAPERBACK == type){
            return rrp;
        }
    
        if(i > 6){
            double d = rrp / 2d;
            return Math.round(d);
        }

        var discount = 0;

        if(i == 0){
            discount = 2;
        }

        return rrp - discount;
    }

}
