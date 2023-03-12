package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SonicController implements KeyListener{

    Sonic sonic;
    public SonicController(Sonic sonic){
    this.sonic= sonic;

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed" +e.getKeyChar());

        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            sonic.startWalking(-5);
        } else if (code == KeyEvent.VK_2) {
            sonic.startWalking(5);
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            sonic.stopWalking();
        } else if (code == KeyEvent.VK_2) {
            sonic.stopWalking();
        }
    }
}
