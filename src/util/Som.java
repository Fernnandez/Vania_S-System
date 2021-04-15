package util;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.SwingUtilities;

public class Som {

    public static void main(String[] args) {
        new Som().som();
    }

    public void som() {
        try {
            // Carrega o arquivo de áudio (não funciona com .mp3, só .wav) 
            String resource = "//Vania's bg/notify.wav";
            InputStream input = getClass().getResourceAsStream(resource);
            Clip oClip = AudioSystem.getClip();
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
            oClip.open(audioInput);

            oClip.loop(0); // Toca uma vez
            //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)

            // Para a execução (senão o programa termina antes de você ouvir o som)
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {

                }
            });
        } catch (Exception e) {
        }

    }
}
