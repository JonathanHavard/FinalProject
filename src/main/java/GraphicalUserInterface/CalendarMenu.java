package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class CalendarMenu {
    PApplet main;
    PImage calendarMen;
    PImage metalMen;
    PImage glassMen;
    String theme;
    int selection =11;
    PImage cal;
    boolean exitStatus = false;


    CalendarMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
        // musicMen = main.loadImage("ImageImport/mbg.png");
    }

    public void keyPressed(char key) {
    if (key == 'a'){
        selection--;
        if (selection == -1){
            selection = 23;
        }
    }
    if (key == 'd'){
        selection++;
        if (selection == 24){
            selection = 0;
        }
    }
    if (key == 's' || key == 'w'){
        exitStatus = true;
    }
    
    }
    

    public void setTheme(String theme_){
        theme = theme_;
    }
    

    public void draw(PApplet main){
        main.background(0,0,0);
        if(theme == "main"){
            calendarMen = main.loadImage("ImageImport/cbg.png");
            main.image(calendarMen, 490, 200);
        }
        if(theme == "metal"){
            metalMen = main.loadImage("ImageImport/Metalic/cbg.png");
            main.image(metalMen, 490, 200);
        }
        if(theme == "glass"){
            calendarMen = main.loadImage("ImageImport/Glass/cbg.png");
            main.image(calendarMen, 490, 200);
        }
        if(theme == "frog"){
            calendarMen = main.loadImage("ImageImport/Frog/cbg.png");
            main.image(calendarMen, 490, 200);
        }

         if (selection == 0){
            cal = main.loadImage("ImageImport/jan2024.png");
        }
        if (selection == 1){
            cal = main.loadImage("ImageImport/feb2024.png");
        }
        if (selection == 2){
            cal = main.loadImage("ImageImport/mar2024.png");
        }
        if (selection == 3){
            cal = main.loadImage("ImageImport/apr2024.png");
        }
        if (selection == 4){
            cal = main.loadImage("ImageImport/may2024.png");
        }
        if (selection == 5){
            cal = main.loadImage("ImageImport/jun2024.png");
        }
        if (selection == 6){
            cal = main.loadImage("ImageImport/jul2024.png");
        }
        if (selection == 7){
            cal = main.loadImage("ImageImport/aug2024.png");
        }
        if (selection == 8){
            cal = main.loadImage("ImageImport/sep2024.png");
        }
        if (selection == 9){
            cal = main.loadImage("ImageImport/oct2024.png");
        }
        if (selection == 10){
            cal = main.loadImage("ImageImport/nov2024.png");
        }
        if (selection == 11){
            cal = main.loadImage("ImageImport/dec2024.png");
        }
        if (selection == 12){
            cal = main.loadImage("ImageImport/jan2025.png");
        }
        if (selection == 13){
            cal = main.loadImage("ImageImport/feb2025.png");
        }
        if (selection == 14){
            cal = main.loadImage("ImageImport/mar2025.png");
        }
        if (selection == 15){
            cal = main.loadImage("ImageImport/apr2025.png");
        }
        if (selection == 16){
            cal = main.loadImage("ImageImport/may2025.png");
        }
        if (selection == 17){
            cal = main.loadImage("ImageImport/jun2025.png");
        }
        if (selection == 18){
            cal = main.loadImage("ImageImport/jul2025.png");
        }
        if (selection == 19){
            cal = main.loadImage("ImageImport/aug2025.png");
        }
        if (selection == 20){
            cal = main.loadImage("ImageImport/sep2025.png");
        }
        if (selection == 21){
            cal = main.loadImage("ImageImport/oct2025.png");
        }
        if (selection == 22){
            cal = main.loadImage("ImageImport/nov2025.png");
        }
        if (selection == 23){
            cal = main.loadImage("ImageImport/dec2025.png");
        }
        main.image(cal, 490, 200);

    }
}
