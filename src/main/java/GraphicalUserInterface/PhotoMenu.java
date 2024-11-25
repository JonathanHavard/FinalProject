package GraphicalUserInterface;
import javafx.scene.control.Menu;
import processing.core.PApplet;
import processing.core.PImage;

public class PhotoMenu {
    PApplet main;
    PImage photoMen;
    PImage metalMen;
    PImage glassMen;
    PImage photo;
    String theme;
    int selectionLength = 0;
    boolean imgDisplayed = false;
    boolean canSelect = false;
    boolean exitStatus = false;

    PhotoMenu(PApplet main_) {
        main = main_;
        icon = new IconTxt(770, 230, "ImageImport/sqicoblckl.png", "frog", 210, main);
        icon2 = new IconTxt(770, 300, "ImageImport/sqicoblckl.png", "another_frog", 210, main);
        icon3 = new IconTxt(770, 370, "ImageImport/sqicoblckl.png", "a_third_frog", 210, main);
        icon4 = new IconTxt(770, 440, "ImageImport/sqicoblckl.png", "another_third_frog", 210, main);
        icon5 = new IconTxt(770, 510, "ImageImport/sqicoblckl.png", "a_third_third_frog", 210, main);
        icon6 = new IconTxt(770, 580, "ImageImport/sqicoblckl.png", "fourth_frog", 210, main);
        exit = new IconTxt(770, 650, "ImageImport/sqicoblck.png", "Exit", 210, main);
    }

    public void Cursor(float x, float y, PApplet main){
        main.fill(0,255,100);
        main.triangle(x-63, y+40, x-63, y+20, x-48, y+30);
    }

    IconTxt icon;
    IconTxt icon2;
    IconTxt icon3;
    IconTxt icon4;
    IconTxt icon5;
    IconTxt icon6;
    IconTxt exit;

    public void setup() {
    }

    public void keyReleased(char key){
        canSelect = true;
    }

    public void keyPressed(char key) {
        if (key == 'w'){
            selectionLength--;
            if (selectionLength == -1){
                selectionLength = 6;
            }
        }
        if (key == 's'){
            selectionLength++;
            if (selectionLength ==7){
                selectionLength = 0;
            }
        }
        if (key == ' '){
            if (canSelect == true){
            if (imgDisplayed == false){
                imgDisplayed = true;
            }
            else{
                imgDisplayed = false;
            }
        }
        }
    }

    public void setTheme(String theme_){
        theme = theme_;
    }

    public void draw(PApplet main){
        if(theme == "main"){
            photoMen = main.loadImage("ImageImport/pbg.png");
            main.image(photoMen, 490, 200);
            }
            if(theme == "metal"){
            metalMen = main.loadImage("ImageImport/Metalic/pbg.png");
            main.image(metalMen, 490, 200);
        }
        if(theme == "glass"){
            photoMen = main.loadImage("ImageImport/Glass/pbg.png");
            main.image(photoMen, 490, 200);
            }
            icon.draw(main);
            icon2.draw(main);
            icon3.draw(main);
            icon4.draw(main);
            icon5.draw(main);
            icon6.draw(main);

            exit.draw(main);

            if (selectionLength == 0){
                Cursor(icon.x, icon.y, main);
            }
            if (selectionLength == 1){
                Cursor(icon2.x, icon2.y, main);
            }
            if (selectionLength == 2){
                Cursor(icon3.x, icon3.y, main);
            }
            if (selectionLength == 3){
                Cursor(icon4.x, icon4.y, main);
            }
            if (selectionLength == 4){
                Cursor(icon5.x, icon5.y, main);
            }
            if (selectionLength == 5){
                Cursor(icon6.x, icon6.y, main);
            }
            if (selectionLength == 6){
                Cursor(exit.x, exit.y, main);
            }
            if (imgDisplayed==true){
                if (selectionLength == 0){
                    photo = main.loadImage("ImageImport/frog1.png");
                    main.image(photo, 490, 200);
                }
                if (selectionLength == 1){
                    photo = main.loadImage("ImageImport/frog2.png");
                    main.image(photo, 490, 200);
                }
                if (selectionLength == 2){
                    photo = main.loadImage("ImageImport/frog3.png");
                    main.image(photo, 490, 200);
                }
                if (selectionLength == 3){
                    photo = main.loadImage("ImageImport/frog4.png");
                    main.image(photo, 490, 200);
                }
                if (selectionLength == 4){
                    photo = main.loadImage("ImageImport/frog5.png");
                    main.image(photo, 490, 200);
                }
                if (selectionLength == 5){
                    photo = main.loadImage("ImageImport/frog6.png");
                    main.image(photo, 490, 200);
                }
                if (selectionLength == 6){
                    selectionLength = 0;
                    exitStatus = true;
                }
        }
    }
}
