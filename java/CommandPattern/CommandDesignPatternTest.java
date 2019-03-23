/**
 * 该类在命令模式中的角色为client
 * 命令模式所含角色有:
 *  client:
 *      发送出意愿的对象,例如这里对象遥控器的使用者
 *  command:
 *      一个命令的抽象,例如一个LightingOnCommand则是实现与它,其中需要有一个接收者的引用,最终命令的实现则依赖与他
 *  invoker
 *      命令的调用者,这里指遥控器本身
 *  receiver:
 *      真正命令的实现对象,对于遥控器来说这里可以使灯泡\洗衣机等被控制的对象
 */
import commands.LightOffCommand;
import commands.LightOnCommand;
import conctroledItems.Light;
import remoteConctl.RemoteConctrl;
import java.util.Map;

import baseInterfaces.Command;

import java.util.HashMap;

public class CommandDesignPatternTest{

    public static void main(String[] args){
        Map<Integer, Command> buttons = new HashMap<>();
        
        /**receiver */
        Light light = new Light();
        /**command */
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        /**此处可以添加各种按键 */
        buttons.put(0, lightOnCommand);
        buttons.put(1, lightOffCommand);
        /**创建一款遥控器:invoker */
        RemoteConctrl remoteConctrl = new RemoteConctrl(buttons);

        /**client:按下按钮 */
        remoteConctrl.buttonPressedWithButtonIndex(0);
        remoteConctrl.undo();
        remoteConctrl.buttonPressedWithButtonIndex(1);
        remoteConctrl.undo();

    }
}