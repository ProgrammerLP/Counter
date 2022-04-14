package actions;



public class counter extends Thread {

    public static boolean running = true;
    public static long time = 1000;
    public static boolean ram = false;

    public void run() {
        while(running) {

            try {
                sleep(time);
                actions.cs -= 1;
                if (actions.ch > 0) {
                    if (actions.cm == 0) {
                        actions.ch -= 1;
                        actions.cm = 59;
                    }
                }

                if (actions.cm > 0) {
                    if (actions.cs == 0) {
                        actions.cm -= 1;
                        actions.cs = 59;
                    }
                }

                if (actions.cm <= 0) {
                    actions.cm = 0;
                }

                if (actions.ch <= 0) {
                    actions.ch = 0;
                }

                if (actions.cs <= 0) {
                    actions.cs = 0;

                    if (!ram && actions.cm <= 0 && actions.ch <= 0 && actions.cs <= 0) {
                        actions.stop = true;
                        ram = true;
                        actions.counter();
                    }

                }

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
