package GraphicalUserInterface;

import processing.core.*;

public class Icon{//TODO ADD PREV ICO
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
        IcoNode upIco;
        IcoNode downIco;
        IcoNode leftIco;
        IcoNode rightIco;
        String icoName;
        int index;
                IcoNode(String icoName, IcoNode up, IcoNode down, IcoNode left, IcoNode right) {
                    this.icoName = icoName;
                }
                String getIcoName(){ //Returns icoName. Useless.
                    return icoName;
                }
                public void setIcoName(String name){ //Sets icoName. Useless.
                    icoName = name;
                }
                IcoNode getUpIco(){ //Returns next Ico. Useless.
                    return upIco;
                }
                IcoNode getDownIco(){ //Returns next Ico. Useless.
                    return downIco;
                }
                IcoNode getLeftIco(){ //Returns next Ico. Useless.
                    return leftIco;
                }
                IcoNode getRightIco(){ //Returns next Ico. Useless.
                    return rightIco;
                }
                void setUpIco(IcoNode up){ //Returns next Ico. Useless.
                     upIco = up;
                }
                void setDownIco(IcoNode down){ //Returns next Ico. Useless.
                    downIco = down;
                }
                void setLeftIco(IcoNode left){ //Returns next Ico. Useless.
                    leftIco = left;
                }
                void setRightIco(IcoNode right){ //Returns next Ico. Useless.
                    rightIco = right;
                }
            }
        
    // class IcoLinkedList{
    //     int indexPointer = 0;
    //     // public void addNode(String iconame){ //Inserts a node at the end of the linked list. 
    //     //     new IcoNode(iconame);
    //     // }
    //     public void SetupMM(){

    //     }
    
    //     }

            
            // if (currIcoNode.getNextIco() == null){
            //     currIcoNode.setPrevIco(currIcoNode);
            //     currIcoNode = new IcoNode(ico);
            //     currIcoNode.setNextIco(currIcoNode);;
    
            //     indexPointer++;
            //     currIcoNode.index = indexPointer;
            //     return;
            // }
            // while (currIcoNode.nextIco != null){
            //     currIcoNode = currIcoNode.nextIco;
            // }
            // currIcoNode.nextIco = new IcoNode(ico);

    
