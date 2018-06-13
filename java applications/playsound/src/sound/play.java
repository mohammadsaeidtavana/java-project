package sound;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by saeedtavana on 7/11/17.
 */
public class play {
    public static void main(String[] args)throws Exception {
        InputStream in = new FileInputStream("/Users/saeedtavana/Desktop/java applications/playsound/src/sound/mah.mp3");

// Create an AudioStream object from the input stream.
        AudioStream as = new AudioStream(in);

// Use the static class member "player" from class AudioPlayer to play
// clip.
        AudioPlayer.player.start(as);

// Similarly, to stop the audio.
        //AudioPlayer.player.stop(as);

    }
}
