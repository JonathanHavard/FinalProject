package GraphicalUserInterface;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import processing.sound.*;
import processing.core.*;


public class Main extends PApplet {
    MenuManager menuManager;
    SoundFile sound;

    public static void main(String[] args) {
        PApplet.main("GraphicalUserInterface.Main");
        
    }

    public void settings(){
        //Changes the size of the screen
        fullScreen();
        size(1920,1200);
        
    }

    public void setup() {
        menuManager = new MenuManager(this);
        menuManager.setup();
    }
    

    public void draw() {
        menuManager.draw(this);
    }

    public void keyPressed(){
        char keyP;
        keyP = key;
        menuManager.keyPressed(keyP);
        if (menuManager.curState == "music"){//Special code because music is being weird
        if (key == ' '){
            // if (sound != null){
            //     sound.stop();
            //     }
            if (menuManager.musicSelection == 0){
                if (sound != null){
                sound.stop();
                sound = null;
                }
            }
            else{
                if (menuManager.musicSelection == 1){
                    if (sound != null){
                        sound.stop();
                        }
                    sound = new SoundFile(this, "Sound/Arabesque.wav");
                    sound.play();
                }
                if (menuManager.musicSelection == 2){
                    if (sound != null){
                        sound.stop();
                        }
                    sound = new SoundFile(this, "Sound/lunw.wav");
                    sound.play();
                }
                if (menuManager.musicSelection == 3){
                    if (sound != null){
                        sound.stop();
                        }
                    sound = new SoundFile(this, "Sound/Jesus bleiblet meine freude.wav");
                    sound.play();
                }
                if (menuManager.musicSelection == 4){
                    if (sound != null){
                        sound.stop();
                        }
                    sound = new SoundFile(this, "Sound/Gymnopédie No. 1.wav");
                    sound.play();
                }
                if (menuManager.musicSelection == 5){
                    if (sound != null){
                    sound.stop();
                    }
                    sound = new SoundFile(this, "Sound/impromptu.wav");
                    sound.play();
                }
                if(menuManager.musicSelection == 6){
                    menuManager.setMusicSelection(0);
                    menuManager.setMusicExitStatus(true);
                    menuManager.setMusicSelection(0);
                }
            }
        }
    }

}
}

