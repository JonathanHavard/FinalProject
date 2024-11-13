package GraphicalUserInterface;

import processing.core.*;

public class Icon{
    PApplet main; //the main class -- provides all the functionality of processing

    float x; //location of Icon
    float y; //location of Icon
    float size; //Icon size
    static int IconColor;
    Icon(float x_, float y_, float size_, int c, PApplet main_){
        x = x_;
        y = y_;
        size = size_;
        IconColor = c;
    
        main = main_;
        size = size_;
    }
}
    class IcoNode{

        IcoNode nextIco;
        String icoName;
        int index;
        IcoNode(String icoName) {
            this.icoName = icoName;
        }
            
        String getIcoName(){ //Returns foodName. Useless.
            return icoName;
        }
        
        public void setIcoName(String name){ //Sets foodName. Useless.
            icoName = name;
        }
        
        IcoNode getNextIco(){ //Returns next Food. Useless.
            return nextIco;
        }
        
        public void setNextFood(IcoNode nxt){ //Sets next Food. Useless.
            nextIco = nxt;
        }
    }

