public class Bai2 {
    public static void main(String[] args) {
     
        MediaAdapter adapter = new MediaAdapter();
        adapter.play("vlc", "bai_hat_moi.vlc");
        
        // chay mot dinh dang khong ho tro
        adapter.play("mp4", "video.mp4");
    }
}


interface MediaPlayer {
    void play(String audioType, String fileName);
}


interface AdvancedMediaPlayer {
    void playVlc(String fileName);
}


class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("dang phat file VLC: " + fileName);
    }
}


class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter() {

        advancedPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        } else {
            System.out.println("dinh dang " + audioType + " khong duoc ho tro.");
        }
    }
}