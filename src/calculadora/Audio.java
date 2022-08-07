/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author JPonce
 */
public class Audio {
    java.io.File wavFile;
    static URL defaultSound;
    public static Clip clip;
    public static AudioInputStream audioInputStream;
    static String s="file:C:\\Users\\JPonce\\Desktop\\Programas en java\\Calculadora\\beep.WAV";
    
    
        public static void play() {
            
           try{
               defaultSound = new URL (s);
            audioInputStream = AudioSystem.getAudioInputStream(defaultSound);

            try {
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                //clip.loop(100);
                clip.start();

            } catch (LineUnavailableException e) {
            }

        } catch (UnsupportedAudioFileException | IOException e) {
        }
    }

    public static void stop() {
        clip.stop();
    }
}
