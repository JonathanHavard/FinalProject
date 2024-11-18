package GraphicalUserInterface;

import processing.core.PApplet;

public class MenuManager extends Main{
    MainMenu mainMenu;
    PhotoMenu photoMenu;
    String curState;

    MenuManager() {
        mainMenu = new MainMenu();
        photoMenu = new PhotoMenu();
    }

    public void setState(String stat){
        curState = stat;
    }
    
    public void setup() {
        curState = "main";
        mainMenu.setup(this);
    }  

    public void draw(PApplet main) {
        if(curState == "main"){
            mainMenu.draw(main);
        }
        if (curState == "photo"){
            photoMenu.draw(main);
        } 
    }
    public void keyPressed(char keyP){
        if (keyP == 'a'){
            curState = "main";
        }
        if (keyP == 'b'){
            curState = "photo";
        }
        else{
            if (curState == "main"){
                mainMenu.keyPressed();
            }
            if (curState == "photo"){
                photoMenu.keyPressed();
         }
        }
    }
}
