package GraphicalUserInterface;
import javafx.scene.Cursor;
import processing.core.PApplet;

public class MainMenu extends PApplet{
    
    CircleIcon icon = new CircleIcon(420, 210, 100, 255, this);
    CircleIcon icon2 = new CircleIcon(220, 210, 100, 255, this); // LATER CREATE AN ARRAY LIST OF ICONS
    CursorCircle cursor = new CursorCircle(420, 210, 100, 255, this);

    MainMenu(Main main_, CircleIcon icon_, CircleIcon icon2_, CursorCircle cursor_){
        main = main_;
        icon = icon_;
        icon2 = icon2_;
        cursor = cursor_;
        
    }

    PApplet main;


public void keyPressed(){
    cursor.keyPressed();
    if (cursor.selection == 0){
        cursor.x = icon.x;
        cursor.y = icon.y;
        draw();
    }
    if (cursor.selection == 1){
        cursor.x = icon2.x;
        cursor.y = icon2.y;
        draw();
    }
}

public void draw(){
    this.background(66,96,235);
    cursor.draw();
    icon2.draw();
    icon.draw();// LATER CREATE AN ARRAY LIST OF ICONS
}

}
