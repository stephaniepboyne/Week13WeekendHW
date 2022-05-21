import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Oboe oboe;
    Oboe oboe2;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange", 2500);
        oboe = new Oboe("Yamaha YOB 241 Oboe", "black", "woodwind", 1200, 1380, "hoo-hoo-hoo");
        oboe2 = new Oboe("Yamaha YOB 200 Oboe", "black", "woodwind", 1000, 1150, "hoo-hoo-hoo");
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(2500.0, shop.getTill(), 0.0);
    }

    @Test
    public void canAddItem(){
        shop.addItem(oboe);
        assertEquals(1, shop.getStock().size());
        assertEquals(1300.0, shop.getTill(), 0.0);
    }

    @Test
    public void canSellItem(){
        shop.addItem(oboe);
        shop.addItem(oboe2);
        shop.sellItem(oboe2);
        assertEquals(1, shop.getStock().size());
        assertEquals(1450.0, shop.getTill(), 0.0);
    }

}
