package yet.another.test.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.Rectangle;
import java.awt.Shape;

import yet.another.test.GameObjets.Bird;
import yet.another.test.GameObjets.ScrollHandler;

/**
 * Created by Katriina on 19.3.2018.
 */

public class GameWorld {

    private Bird bird;
    private ScrollHandler scroller;

    public GameWorld(int midPointY) {
        bird = new Bird(33,midPointY - 5,10,6);
        scroller = new ScrollHandler(midPointY + 132);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {
        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }

}
