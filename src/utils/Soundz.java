package Utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Soundz {

    // AudioInputStream splatAudio = AudioSystem.getAudioInputStream(new File("/home/matto/NetBeansProjects/Javattenn/src/javattenn/splatt.wav"));
    //AudioInputStream menuAudio = AudioSystem.getAudioInputStream(new File("/home/matto/NetBeansProjects/Javattenn/src/javattenn/errorRemix.wav"));
    //AudioInputStream missAudio = AudioSystem.getAudioInputStream(new File("/home/matto/NetBeansProjects/Javattenn/src/javattenn/miss.wav"));
    //SERVE PER PRENDERE LE RISORSE DALLA CARTELLA DEL PROGETTO PER DISTRUBUZIONE
    AudioInputStream pulsantiAudio = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/Resources/Audio/pulsanti.wav")));
  
    // AudioInputStream menuAudio = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/javattenn/errorRemix.wav")));

      AudioInputStream restartAudio = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/Resources/Audio/fail.wav")));


//    AudioInputStream failAudio1 = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/Resources/Audio/fail1.wav")));
//    AudioInputStream failAudio2 = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/Resources/Audio/fail2.wav")));

    Clip pulsantiClip;
    Clip restartClip;
    Clip menuClip;
//    Clip loseClip1;
//    Clip loseClip2;

    public Soundz() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //this.splatAudio = AudioSystem.getAudioInputStream(new File("/home/matto/NetBeansProjects/Javattenn/src/javattenn/splatt.wav"));
        //this.menuAudio = AudioSystem.getAudioInputStream(new File ("/home/matto/NetBeansProjects/Javattenn/src/javattenn/errorRemix.wav"));
        //this.menuClip = AudioSystem.getClip();
        // menuClip.open(menuAudio);
        this.restartClip = AudioSystem.getClip();
        restartClip.open(restartAudio);

        this.pulsantiClip = AudioSystem.getClip();
        pulsantiClip.open(pulsantiAudio);

//        this.loseClip1 = AudioSystem.getClip();
//        loseClip1.open(failAudio1);
//
//        this.loseClip2 = AudioSystem.getClip();
//        loseClip2.open(failAudio2);
    }

    public void PlayMenuSound() throws LineUnavailableException, IOException {
        AudioInputStream menuAudio = null;
        try {
            menuAudio = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/Resources/Audio/IlRegnodiGhiaccio.wav")));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Soundz.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.menuClip = AudioSystem.getClip();

        menuClip.open(menuAudio);
        this.menuClip.setFramePosition(0);
        //his.menuClip.loop(Clip.LOOP_CONTINUOUSLY);
        // this.menuClip.setFramePosition(0);
        this.menuClip.start();
    }

    public void StopMenuSound() throws LineUnavailableException, IOException {

        this.menuClip.stop();
        this.menuClip.close();

    }

    public void PlayRestartSound() {

        this.restartClip.setFramePosition(0);
        this.restartClip.start();

    }

    public void PlayPulsantiSound() {

        this.pulsantiClip.setFramePosition(0);
        this.pulsantiClip.start();

    }

//    public void PlayFailSound() {
//        Random random = new Random();
//        int r = random.nextInt(100);
//
//        if (r <= 50) {
//            this.loseClip1.setFramePosition(0);
//            this.loseClip1.start();
//        } else {
//            this.loseClip2.setFramePosition(0);
//            this.loseClip2.start();
//        }
//    }
}
