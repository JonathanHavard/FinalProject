package GraphicalUserInterface;
import org.bouncycastle.mail.smime.handlers.multipart_signed;

import processing.core.PApplet;
import processing.core.PImage;

public class SettingsMenu{
    PApplet main;
    MenuManager menuManager;
    PImage settingsMen;
    PImage metalMen;
    PImage glassMen;
    String theme;
    int selectionLength = 0;
    public void SelectionInd(float x,float y, PApplet main){
        main.fill(210);
        main.noStroke();
        main.circle(x-30, y+30, 20);
    }
    public void Cursor(float x, float y, PApplet main){
        main.fill(0,255,100);
        main.triangle(x-70, y+40, x-70, y+20, x-55, y+30);
    }
    SettingsMenu(PApplet main_) {
        main = main_;
        icon = new IconTxt(620, 330, "ImageImport/sqicoblck.png", "sky", 210, main);
        icon2 = new IconTxt(620, 400, "ImageImport/sqicoblck.png", "metal", 210, main);
        icon3 = new IconTxt(620, 470, "ImageImport/sqicoblck.png", "glass", 210, main);
    }
    IconTxt icon;
    IconTxt icon2;
    IconTxt icon3;

    public void keyPressed(char key) {
        if (key == 'w'){
            selectionLength--;
            if (selectionLength == -1){
                selectionLength = 2;
            }
        }
        if (key == 's'){
            selectionLength++;
            if (selectionLength ==3){
                selectionLength = 0;
            }
        }
        if (key == ' '){
            if (selectionLength ==0){
                setTheme("main");
            }
            if (selectionLength ==1){
                setTheme("metal");
            }
            if (selectionLength ==2){
                setTheme("glass");
            }
        }
    }

    public void setTheme(String theme_){
        theme = theme_;
    }
    public String getTheme(){
        return theme;
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        
        if(theme == "main"){
        settingsMen = main.loadImage("ImageImport/sbg.png");
        main.image(settingsMen, 490, 200);
        SelectionInd(icon.x, icon.y, main);
        }
        if(theme == "metal"){
        metalMen = main.loadImage("ImageImport/Metalic/sbg.png");
        main.image(metalMen, 490, 200);
        SelectionInd(icon2.x, icon2.y, main);
        }
        if(theme == "glass"){
        settingsMen = main.loadImage("ImageImport/Glass/sbg.png");
        main.image(settingsMen, 490, 200);
        SelectionInd(icon3.x, icon3.y, main);
        }
        icon.draw(main);
        icon2.draw(main);
        icon3.draw(main);
        if (selectionLength == 0){
            Cursor(icon.x, icon.y, main);
        }
        if (selectionLength == 1){
            Cursor(icon2.x, icon2.y, main);
        }
        if (selectionLength == 2){
            Cursor(icon3.x, icon3.y, main);    
        }
    }
}

