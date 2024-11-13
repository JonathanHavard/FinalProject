package GraphicalUserInterface;

public class MainMenu extends Main{
public void setup(){
    draw();
    
}

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
