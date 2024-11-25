package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;
import processing.sound.*;

public class MusicMenu{
    IconTxt icon;
    IconTxt icon2;
    IconTxt icon3;
    IconTxt icon4;
    IconTxt icon5;
    IconTxt icon6;
    IconTxt exit;
    Cursor cursor;
    PApplet main;
    PImage musicMen;
    String theme;
    int selection = 0;
    boolean exitStatus = false;
    
    

    MusicMenu(PApplet main_) {
        main = main_;
        icon = new IconTxt(770, 230, "ImageImport/sqicoblckl.png", "Stop Playback", 210, main);
        icon2 = new IconTxt(770, 300, "ImageImport/sqicoblckl.png", "Arabesque No 1", 210, main);
        icon3 = new IconTxt(770, 370, "ImageImport/sqicoblckl.png", "Beneath the Mask", 210, main);
        icon4 = new IconTxt(770, 440, "ImageImport/sqicoblckl.png", "Jesus Bleibet-", 210, main);
        icon5 = new IconTxt(770, 510, "ImageImport/sqicoblckl.png", "Gymnopedie 1", 210, main);
        icon6 = new IconTxt(770, 580, "ImageImport/sqicoblckl.png", "", 210, main);
        exit = new IconTxt(770, 650, "ImageImport/sqicoblck.png", "Exit", 210, main);
        
    }
    
    public void setup() {
        
    }
    public void Cursor(float x, float y, PApplet main){
        main.fill(0,255,100);
        main.triangle(x-63, y+40, x-63, y+20, x-48, y+30);
    }
    
    
    public void keyPressed(char keyP) {
        
        if (keyP == 'w'){

            selection--;
            if (selection == -1){
                selection = 6;
            }
        }
        if (keyP == 's'){
            selection++;
            if (selection ==7){
                selection = 0;
            }
        } 
    }

    
    public void setTheme(String theme_){
        theme = theme_;
    }

    public int getSelection(){
        return selection;
    }

    public void draw(PApplet main){
        if(theme == "main"){
                musicMen = main.loadImage("ImageImport/mbg.png");
                main.image(musicMen, 490, 200);
            }
            if(theme == "metal"){
                musicMen = main.loadImage("ImageImport/Metalic/mbg.png");
                main.image(musicMen, 490, 200);
            }
            if(theme == "glass"){
                musicMen = main.loadImage("ImageImport/Glass/mbg.png");
                main.image(musicMen, 490, 200);
            }  
            icon.draw(main);
            icon2.draw(main);
            icon3.draw(main);
            icon4.draw(main);
            icon5.draw(main);
            icon6.draw(main);
            exit.draw(main);  
            if (selection == 0){
                Cursor(icon.x, icon.y, main);
            }
            if (selection == 1){
                Cursor(icon2.x, icon2.y, main);
            }
            if (selection == 2){
                Cursor(icon3.x, icon3.y, main);
            }
            if (selection == 3){
                Cursor(icon4.x, icon4.y, main);
            }
            if (selection == 4){
                Cursor(icon5.x, icon5.y, main);
            }
            if (selection == 5){
                Cursor(icon6.x, icon6.y, main);
            }
            if (selection == 6){
                Cursor(exit.x, exit.y, main);
            } 
    }
}
