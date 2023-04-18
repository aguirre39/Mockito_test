package mockito;


public class VolumeUtil {
    
    private AudioManager audioManager;

    public void setAudioManager(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void maximizeVolume(int max) {
        if (audioManager != null) {
            audioManager.setVolume(max);
        }
    }

} 