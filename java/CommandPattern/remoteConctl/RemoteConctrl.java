package remoteConctl;

import baseInterfaces.Command;
import java.util.Map;
import java.util.HashMap;

/**描述遥控器 */
public class RemoteConctrl{

    /**代表遥控器上面的按键, <按键index, 按键对应的命令>
    */
    private  Map<Integer,Command> mButtons;
    private int preIndex;
    

    public RemoteConctrl(Map<Integer, Command> buttons){

        mButtons = buttons;
    }

    /**根据传入的按键index,去调用他的功能 */
    public int buttonPressedWithButtonIndex(int index){
        
        Command com = mButtons.get(index);
        if(com == null)
            return -1;
        preIndex = index;
        return com.execCommand();
    }

    public int undo(){

        Command com = mButtons.get(preIndex);
        if(com == null)
            return -1;
            
        return com.undo();
    }
}
