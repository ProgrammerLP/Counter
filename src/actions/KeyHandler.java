package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    counter c = new counter();
    Musik m = new Musik();

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (counter.running) {
                        c.start();
                    }

                }

                if (e.getKeyCode() == KeyEvent.VK_W) {
                    actions.ch += 1;
                }

                if (e.getKeyCode() == KeyEvent.VK_E) {
                    actions.cm += 1;
                }

                if (e.getKeyCode() == KeyEvent.VK_R) {
                    actions.cs += 1;
                }

                if (e.getKeyCode() == KeyEvent.VK_S) {
                  actions.ch -= 1;
                }

                if (e.getKeyCode() == KeyEvent.VK_D) {
                    actions.cm -= 1;
                }

                if (e.getKeyCode() == KeyEvent.VK_F) {
                    actions.cs -= 1;
                }

                if (e.getKeyCode() == KeyEvent.VK_UP) {

                    actions.cs += 1;

                    if (actions.cs >= 60) {
                        actions.cs = 0;
                        actions.cm += 1;
                    }

                    if (actions.cm >= 60) {
                        actions.cm = 0;
                        actions.ch += 1;
                    }

                    if (actions.ch > 999) {
                        actions.cs = 0;
                        actions.cm = 0;
                        actions.ch = 0;
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {

                    actions.ch -= 1;

                    if (actions.ch < 0) {
                        actions.cm -= 1;
                        actions.ch = 0;
                    }

                    if (actions.cm < 0) {
                        actions.cs -= 1;
                        actions.cm = 0;
                    }

                    if (actions.cs < 0) {
                        actions.ch = 999;
                        actions.cm = 59;
                        actions.cs = 59;
                    }

                }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
