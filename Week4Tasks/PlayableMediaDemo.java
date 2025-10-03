package Week4Tasks;
interface Playable {
    void play();
    void pause();
}

class AudioPlayer implements Playable {
    public void play() {
        System.out.println("Audio is playing...");
    }

    public void pause() {
        System.out.println("Audio is paused.");
    }
}

class VideoPlayer implements Playable {
    public void play() {
        System.out.println("Video is playing...");
    }

    public void pause() {
        System.out.println("Video is paused.");
    }
}

public class PlayableMediaDemo {
    public static void main(String[] args) {
        Playable audio = new AudioPlayer();
        Playable video = new VideoPlayer();

        audio.play();
        audio.pause();

        video.play();
        video.pause();
    }
}
