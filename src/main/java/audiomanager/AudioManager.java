package audiomanager;

public class AudioManager {
    private int volume = 50;
    private RingerMode mode = RingerMode.RINGER_MODE_SILENT;

    public RingerMode getRingerMode() {
        return mode;
    }
    public int getStreamMaxVolume() {
        return volume;
    }
    public void setStreamVolume(int max) {
        volume = max;
    }
    public void makeReallyLoad() {
        if (mode.equals(RingerMode.RINGER_MODE_NORMAL)) {
            setStreamVolume(100);
        }
    }
}
