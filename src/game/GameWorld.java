package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

public class GameWorld extends World{
    Sonic sonic;

    public GameWorld(){
        super();
        //2. populate the gameWorld it with bodies (ex: platforms, collectibles, characters)

        //make a ground platform
        Shape shape = new BoxShape(30, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make a suspended platform
        Shape platformShape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, -4f));

        //make a character (with an overlaid image)

        sonic =new Sonic(this);
        sonic.setPosition(new Vec2(4,-5));

        BeeBot beeBot = new BeeBot(this);
        beeBot.setPosition(new Vec2(-5,-10));


    }
    public Sonic getSonic(){
        return sonic;
    }
}
