package game;

import city.cs.engine.DebugViewer;

import javax.swing.*;

/**
 * Your main game entry point
 */
public class Game {


    /** Initialise a new Game. */
    public Game() {

        //1. make an empty game world
        //World world = new World();
        GameWorld world = new GameWorld();



        //3. make a view to look into the game world
        ///UserView view = new UserView(world, 1000, 800);
        GameView view = new GameView(world,1000,800);

        //optional: draw a 1-metre grid over the view
        // view.setGridResolution(1);
        world.getSonic();

        SonicController sonicController= new SonicController(world.getSonic());
        view.addKeyListener(sonicController);

        view.addMouseListener(new GiveFocus(view));




        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
         JFrame debugView = new DebugViewer(world, 1000, 800);

        // start our game world simulation!
        world.start();

        view.requestFocus();
    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();
    }

}
