package audiomanager;

public class VolumeUtil {
    
    public static void maximizeVolume(AudioManager audioManager) {
        if (audioManager.getRingerMode() != RingerMode.RINGER_MODE_SILENT) {
            int max = audioManager.getStreamMaxVolume();
            audioManager.setStreamVolume(max);
        }
//        else audioManager.setStreamVolume(50);
    }
}
