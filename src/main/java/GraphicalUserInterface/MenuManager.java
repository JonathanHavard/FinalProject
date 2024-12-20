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
    int musicSelection = -1;
    boolean canSelectMusic;

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
            if (musicMenu.exitStatus == true){
                curState = "main";
                musicMenu.exitStatus = false;
            }
        } 
        if (curState == "calendar"){
            calendarMenu.draw(main);
            if(calendarMenu.exitStatus == true){
                curState = "main";
                calendarMenu.exitStatus = false;
            }
        }
        if (curState == "photo"){
            photoMenu.draw(main);
            if (photoMenu.exitStatus == true){
                curState = "main";
                photoMenu.exitStatus = false;
            }
        }
        if (curState == "settings"){
            settingsMenu.draw(main);
            if (settingsMenu.exitStatus == true){
                curState = "main";
                settingsMenu.exitStatus = false;
            }
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
                if (keyP == ' '){
                    musicSelection = musicMenu.getSelection();
            }
        }
            if (curState == "photo"){
                photoMenu.keyPressed(keyP);
                photoMenu.keyReleased(keyP);
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
    }
    //Special code for the music menu
    void setMusicExitStatus(boolean stat){
        musicMenu.exitStatus = stat;
    }
    void setMusicSelection(int sel){
        musicMenu.selection = sel;
    }
    }

