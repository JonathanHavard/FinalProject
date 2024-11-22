package GraphicalUserInterface;

import javafx.scene.Cursor;
import processing.core.PApplet;

public class MenuManager{
    PApplet main;
    MainMenu mainMenu;
    MusicMenu musicMenu;
    CalendarMenu calendarMenu;
    PhotoMenu photoMenu;
    SettingsMenu settingsMenu;
    String curState;
    String theme;

    MenuManager(PApplet main_){
        mainMenu = new MainMenu(main);
        musicMenu = new MusicMenu(main);
        calendarMenu = new CalendarMenu(main);
        photoMenu = new PhotoMenu(main);
        settingsMenu = new SettingsMenu(main);
        main = main_;
    }

    public void setState(String stat){
        curState = stat;
    }
    
    public void setup() {
        curState = "main";
        setTheme("main");
        mainMenu.setup(main);
    }  
    public void setTheme(String theme){ //Sets themes for all classes
        mainMenu.setTheme(theme);
        settingsMenu.setTheme(theme);
        photoMenu.setTheme(theme);
        musicMenu.setTheme(theme);
        settingsMenu.setTheme(theme);
        calendarMenu.setTheme(theme);
    }

    public void draw(PApplet main) {
        if(curState == "main"){
            mainMenu.draw(main);
        }
        if (curState == "music"){
            musicMenu.draw(main);
        } 
        if (curState == "calendar"){
            calendarMenu.draw(main);
        }
        if (curState == "photo"){
            photoMenu.draw(main);
        }
        if (curState == "settings"){
            settingsMenu.draw(main);
        }
    }
    public void keyPressed(char keyP){
        if(keyP == ' '){
            if (curState == "main"){
                if (mainMenu.getSelection() == 0){
                    curState = "calendar";
                }
                if (mainMenu.getSelection() == 1){ 
                    curState = "music";
                    
                }
                if (mainMenu.getSelection() == 2){ 
                    curState = "photo";
                    
                }
                if (mainMenu.getSelection() == 3){
                    curState = "settings";
                }
            }
        }

            if (curState == "main"){
                mainMenu.keyPressed(keyP);
            }
            if (curState == "music"){
                musicMenu.keyPressed(keyP);
            }
            if (curState == "photo"){
                photoMenu.keyPressed(keyP);
            }
            if (curState == "calendar"){
                calendarMenu.keyPressed(keyP);
            }
            if (curState == "settings"){
                settingsMenu.keyPressed(keyP);
                if (keyP == ' '){
                setTheme(settingsMenu.getTheme()); //This is kinda a hardcore response but its the only way I thought.
                }
            }
         if(keyP == 'q'){
            curState = "main";
         }
         if (keyP == 'r'){//TODO Temp
            setTheme("metal");
        }
        if (keyP == 'e'){//TODO Temp
            setTheme("main");
        }
        if (keyP == 't'){
            setTheme("glass");
        }

    }
    }
