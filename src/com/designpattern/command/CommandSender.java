package com.designpattern.command;

/**
 * <p>
 * 命令的发送者
 * </p>
 *
 * @author mf
 * @date 2019-06-28 10:34
 */
public class CommandSender {

    private BaseCommand baseCommand;


    public CommandSender(BaseCommand baseCommand) {
        this.baseCommand = baseCommand;
    }

    public void setBaseCommand(BaseCommand baseCommand) {
        this.baseCommand = baseCommand;
    }

    /**
     * <p>
     *  调用者的命令执行方法
     * </p>
     *
     * @param
     * @return void see {@link }
     * @author mf
     * @date 2019/6/28 10:35
     */
    public void excute() {
        baseCommand.executeCommand();
    }
}
