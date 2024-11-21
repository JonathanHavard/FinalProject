package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class MainMenu{
    PApplet main;
    MainMenu(PApplet main_){
        main = main_;
        icon = new CircleIcon(620, 330,"ImageImport/calLogo.png", main);
        icon2 = new CircleIcon(830, 330, "ImageImport/musicLogo.png", main);
        icon3 = new CircleIcon(620, 500, "ImageImport/camLogo.png", main);
        icon4 = new CircleIcon(830, 500, "ImageImport/settingsLogo.png", main);
        cursor = new CursorCircle(620, 330);       

    }
    CircleIcon icon;
    CircleIcon icon2;
    CircleIcon icon3;
    CircleIcon icon4;
    CursorCircle cursor;
    DisplayScreen displayScreen;
    PImage mainMen;

    public void setup(PApplet main) {
        mainMen = main.loadImage("ImageImport/bg.png");
    }
//SELECTIONS 0= calendar 1=music 2= photo 3= settings
    public void keyPressed(char keyP) {
        cursor.keyPressed();
        if (keyP == 'a'){//left selection
            cursor.selection--;
            if (cursor.selection<=-1){
                cursor.selection=3;
            }
        }
        if (keyP == 'd'){//right selection
            cursor.selection++;
            if (cursor.selection >=4){
                cursor.selection=0;
            }
        }
        if (keyP == 'w'){
            cursor.selection -=2;
            //FOR THE TOP ICONS
            if (cursor.selection ==-2){
                cursor.selection = 2;
            }
            if (cursor.selection ==-1){
                cursor.selection = 3;
            }
        }
        if (keyP == 's'){
            cursor.selection +=2;
            //FOR BOTTOM ICONS
            if (cursor.selection ==4){
                cursor.selection = 0;
            }
            if (cursor.selection ==5){
                cursor.selection = 1;
            }
//______________________________________________________________________________________________
        }
        if (cursor.selection == 0){
            cursor.x = icon.x;
            cursor.y = icon.y;
        }
        if (cursor.selection == 1){
            cursor.x = icon2.x;
            cursor.y = icon2.y;
        }
        if (cursor.selection == 2){
            cursor.x = icon3.x;
            cursor.y = icon3.y;
        }
        if (cursor.selection == 3){
            cursor.x = icon4.x;
            cursor.y = icon4.y;
        } 
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        main.image(mainMen, 490, 200);
        main.fill(0,255,0);
        cursor.draw(main);
        icon.draw(main);
        icon2.draw(main);
        icon3.draw(main);
        icon4.draw(main);
    }

    public int getSelection(){
        return cursor.selection;
    }
    public void Selection(int sel){
        cursor.selection = sel;
    }

}
