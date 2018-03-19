package yet.another.test.GameObjets;

import java.util.Random;

/**
 * Created by Katriina on 19.3.2018.
 */

public class Pipe extends Scrollable {

    private Random r;

    public Pipe(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);
        r = new Random();
    }

    @Override
    public void reset(float newX) {
        // Call the reset method in the superclass (Scrollable)
        super.reset(newX);
        // Change the height to a random number
        height = r.nextInt(45) + 15;

    }
}