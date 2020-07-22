package sandbox;
import sandbox.pixels.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class KeyHandler implements KeyListener{

    public int chosen = 0;
    public final Pixel[] pixels = {
        new Sand(0,0),
        new Sand(0,0),
        new Water(0,0),
        new Soil(0,0),
        new Stone(0,0),
        new Wood(0,0),
        new Fire(0,0),
        new Sand(0,0),
        new Sand(0,0),
        new Sand(0,0),
    };
    private final char[] nums = {'0','1','2','3','4','5','6','7','8','9'};

    public void KeyHandler(){}

    @Override
    public void keyPressed(KeyEvent e){}

    @Override
    public void keyReleased(KeyEvent e){}

    @Override
    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();

        if (keyChar == '0' || keyChar == '1' || keyChar == '2' || keyChar == '3' || keyChar == '4' || keyChar == '5' || keyChar == '6' || keyChar == '7' || keyChar == '8' || keyChar == '9') {
            chosen = Integer.parseInt(String.valueOf(keyChar));
            System.out.println(chosen);
        }
    }
}