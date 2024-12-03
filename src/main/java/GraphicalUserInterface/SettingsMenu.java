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
    boolean exitStatus = false;
    boolean canSelect = true;//TODO fix this

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
        icon4 = new IconTxt(620, 540, "ImageImport/sqicoblck.png", "frog", 210, main);
        icon5 = new IconTxt(620, 610, "ImageImport/sqicoblck.png", "Exit", 210, main);
        
        

        iconm = new IconTxt(620, 330, "ImageImport/Metalic/sqicoblck.png", "sky", 210, main);
        iconm2 = new IconTxt(620, 400, "ImageImport/Metalic/sqicoblck.png", "metal", 210, main);
        iconm3 = new IconTxt(620, 470, "ImageImport/Metalic/sqicoblck.png", "glass", 210, main);
        iconm4 = new IconTxt(620, 540, "ImageImport/Metalic/sqicoblck.png", "frog", 210, main);
        iconm5 = new IconTxt(620, 610, "ImageImport/Metalic/sqicoblck.png", "Exit", 210, main);

        icong = new IconTxt(620, 330, "ImageImport/Glass/sqicoblck.png", "sky", 210, main);
        icong2 = new IconTxt(620, 400, "ImageImport/Glass/sqicoblck.png", "metal", 210, main);
        icong3 = new IconTxt(620, 470, "ImageImport/Glass/sqicoblck.png", "glass", 210, main);
        icong4 = new IconTxt(620, 540, "ImageImport/Glass/sqicoblck.png", "frog", 210, main);
        icong5 = new IconTxt(620, 610, "ImageImport/Glass/sqicoblck.png", "Exit", 210, main);
    }
    IconTxt icon;
    IconTxt icon2;
    IconTxt icon3;
    IconTxt icon4;
    IconTxt icon5;

    IconTxt iconm;
    IconTxt iconm2;
    IconTxt iconm3;
    IconTxt iconm4;
    IconTxt iconm5;

    IconTxt icong;
    IconTxt icong2;
    IconTxt icong3;
    IconTxt icong4;
    IconTxt icong5;

    
    public void keyReleased(){
        canSelect = true;
        System.out.println("a");
    }

    public void keyPressed(char key) {
        if (key == 'w'){
            selectionLength--;
            if (selectionLength == -1){
                selectionLength = 4;
            }
        }
        if (key == 's'){
            selectionLength++;
            if (selectionLength ==5){
                selectionLength = 0;
            }
        }
        if (key == ' '){
            if (canSelect == true){
            if (selectionLength ==0){
                setTheme("main");
            }
            if (selectionLength ==1){
                setTheme("metal");
            }
            if (selectionLength ==2){
                setTheme("glass");
            }
            if (selectionLength ==3){
                setTheme("frog");
            }
            if (selectionLength == 4){
                if (theme == "main"){
                    selectionLength =0;
                }
                if (theme == "metal"){
                    selectionLength =1;
                }
                if (theme == "glass"){
                    selectionLength =2;
                }
                if (theme == "frog"){
                    selectionLength =3;
                }
                exitStatus = true;
            }
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
        icon.draw(main);
        icon2.draw(main);
        icon3.draw(main);
        icon4.draw(main);
        icon5.draw(main);
        }
        if(theme == "metal"){
        metalMen = main.loadImage("ImageImport/Metalic/sbg.png");
        main.image(metalMen, 490, 200);
        SelectionInd(icon2.x, icon2.y, main);
        iconm.draw(main);
        iconm2.draw(main);
        iconm3.draw(main);
        iconm4.draw(main);
        iconm5.draw(main);
        }
        if(theme == "glass"){
        settingsMen = main.loadImage("ImageImport/Glass/sbg.png");
        main.image(settingsMen, 490, 200);
        SelectionInd(icon3.x, icon3.y, main);
        icong.draw(main);
        icong2.draw(main);
        icong3.draw(main);
        icong4.draw(main);
        icong5.draw(main);
        }
        if(theme == "frog"){
            settingsMen = main.loadImage("ImageImport/Frog/sbg.png");
            main.image(settingsMen, 490, 200);
            SelectionInd(icon3.x, icon3.y, main);
            icon.draw(main);
            icon2.draw(main);
            icon3.draw(main);
            icon4.draw(main);
            icon5.draw(main);
            }

        if (selectionLength == 0){
            Cursor(icon.x, icon.y, main);
        }
        if (selectionLength == 1){
            Cursor(icon2.x, icon2.y, main);
        }
        if (selectionLength == 2){
            Cursor(icon3.x, icon3.y, main);    
        }
        if (selectionLength ==3){
            Cursor(icon4.x, icon4.y, main);
        }
        if (selectionLength ==4){
            Cursor(icon5.x, icon5.y, main);
        }
    }
}

