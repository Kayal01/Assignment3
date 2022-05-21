public class CoffeeMachine
{
    Money m = new Money();
    Stock s = new Stock();
    public void coffee(int s){
        this.s.addToStock(s);
    }
    void despence(int x){
        while(x>0 && s.isEmpty()){
            System.out.println("coffee");
            m.addOnePound();
            s.takeFromStock();
            x--;
        }
        if (x!=0)
            System.out.println("machine empty");
    }
    void status(){
        System.out.println("there are "+m.isEmpty()+" coins\nthere are
                "+s.isEmpty()+" coffees in stock\n");
    }
    public static void main(String args[]){
    }
}
