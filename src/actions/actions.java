package actions;

public class actions {

    public static int cs = 10;
    public static int cm = 0;
    public static int ch = 0;
    public static  boolean stop = false;
    public static boolean stopmusic = false;

    public static void counter() {

        if (cs == 0 && cm == 0 && ch == 0 && stop) {

            Musik.music("audio/Arpy.wav");

        }

        if (cs < 0 && cm < 0 && ch < 0) {
            cs = 0;
            cm = 0;
            ch = 0;
        }

    }

}
