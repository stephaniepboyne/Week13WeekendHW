import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    MusicStand musicStand;

    @Before
    public void before(){
        musicStand = new MusicStand("Pure Tone: Music Stand with Case", "pink", 13, 14.95);
    }

    @Test
    public void hasDescription(){
        assertEquals("Pure Tone: Music Stand with Case", musicStand.getDescription());
    }

    @Test
    public void hasColour(){
        assertEquals("pink", musicStand.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(13, musicStand.getPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(14.95, musicStand.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals("The markup on this item is: 15.00%.", musicStand.calculateMarkup(musicStand.getPrice(), musicStand.getSellingPrice()));
    }
}
