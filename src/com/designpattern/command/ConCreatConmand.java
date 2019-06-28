package com.designpattern.command;

/**
 * <p>
 * 具体的命令
 * </p>
 *
 * @author mf
 * @date 2019-06-28 10:39
 */
public class ConCreatConmand extends BaseCommand {

    public ConCreatConmand(CommandReciever reciever) {
        this.reciever = reciever;
    }

    private CommandReciever reciever;


    @Override
    void executeCommand() {
        reciever.recievCommand();
    }
}
