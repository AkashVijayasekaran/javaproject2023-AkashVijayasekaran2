package game;

import city.cs.engine.*;


    public class Sonic extends Walker {
        private static final Shape sonicShape = new BoxShape(1,2);

        private static final BodyImage image = new BodyImage("data/student.png", 4);

        public Sonic(World world){
            super(world, sonicShape);
            this.addImage(image);

        }
    }

