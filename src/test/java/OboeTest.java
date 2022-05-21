import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe("Yamaha YOB 241 Oboe", "black", "woodwind", 1200, 1380, "hoo-hoo-hoo");
        oboe.getMaterials().add("wood");
        oboe.getMaterials().add("plastic");
        oboe.getMaterials().add("silver");
    }

    @Test
    public void hasName(){
        assertEquals("Yamaha YOB 241 Oboe", oboe.getName());
    }

    @Test
    public void hasColour(){
        assertEquals("black", oboe.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("woodwind", oboe.getType());
    }

    @Test
    public void hasSound(){
        assertEquals("hoo-hoo-hoo", oboe.getSound());
    }

    @Test
    public void hasMaterials(){
        assertEquals(3, oboe.getMaterials().size());
    }

    @Test
    public void canBePlayed(){
        assertEquals("hoo-hoo-hoo", oboe.play(oboe.getSound()));
    }

    @Test
    public void hasPrice(){
        assertEquals(1200, oboe.getPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1380, oboe.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals("The markup on this item is: 15.00%.", oboe.calculateMarkup(oboe.getPrice(), oboe.getSellingPrice()));
    }

}
