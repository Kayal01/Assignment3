public class Stock {
    int stock=10;
    boolean isEmpty(){
        if(stock>0)
            return true;
        else
            return false;
    }
    void addToStock(int add){
        stock +=add;
    }
    void takeFromStock(){
        stock -=1;
    }
    void redeem(){
        stock =0;
    }
    int showAvailableStock(){
        return stock;
    }
}
