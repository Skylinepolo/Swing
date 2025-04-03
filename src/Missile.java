import java.awt.event.KeyEvent;
import java.util.Set;

import static utils.Constants.*;

public class Missile extends Sprite {
    private double dx;
    private double dy;


    public Missile () {

        super(MISSILE_IMAGE_PATH, 0, 0, MISSILE_WIDTH, MISSILE_HEIGHT);
        getPos().x = BOARD_WIDTH - MISSILE_WIDTH;
        getPos().y = 0;

    }

    @Override
    public void tick() {
        getPos().x -= MISSILE_SPEED;

    }

}
