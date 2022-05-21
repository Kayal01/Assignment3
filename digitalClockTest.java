import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class digitalClockTest {

    @Test
    void test() {
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
    }
    @Test
    public void test1(){
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
        assertEquals("Already turned on",d.On());
        assertEquals("Turned off",d.Off());
    }
    @Test
    public void test2(){
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
        assertEquals("Already turned on",d.On());
    }

    @Test
    public void test3(){
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
        assertEquals("Timer set",d.setTimer(10));
    }
    @Test
    public void test4(){
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
        assertEquals("Timer set",d.setTimer(10));
        assertEquals("Wait for timer to end",d.operate());
    }
    @Test
    public void test5(){
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimer = false;
        assertEquals("Accepted",d.operate());
    }
    @Test
    public void test6(){
        digitalClock d = new digitalClock();
        assertEquals("Turned On!",d.On());
        assertEquals("Timer set",d.setTimer(10));
        d.isTimer = false;
        assertEquals("Accepted",d.operate());
        assertEquals("Turned off",d.Off());
    }

}