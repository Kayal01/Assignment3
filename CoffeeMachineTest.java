import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CoffeeMachineTest extends TestCase {
    CoffeeMachine x;
    Stock k;
    Money m;
    String s;
    @BeforeEach
    public void init() {
        x = new CoffeeMachine();
        k = new Stock();
        m = new Money();
    }
    class coinInsert{
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void coffeeStub(){
        coinInsert y = new coinInsert();
        x.despence(y.insert(5));
        assertEquals(x.s.stock,5);
    }
    class doubleCoffee{
        String check(int x){
            if(x%2==0)
                return "you can make double coffees";
            else
                return "you can't make double coffees";
        }
    }
    @Test
    public void stockDriver(){
        doubleCoffee y = new doubleCoffee();
        s = y.check(k.showAvailableStock());
        assertEquals(s,"you can make double coffees");
        k.takeFromStock();
        s = y.check(k.showAvailableStock());
        assertEquals(s,"you can't make double coffees");
    }
    @AfterEach
    public void clean(){
        x=null ;
    }
}