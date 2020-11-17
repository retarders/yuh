package top.retarders.yuh.command;

import io.airlift.airline.Command;

@Command(
        name = "help",
        description = "provides help with yuh"
)
public class HelpCommand implements Runnable {

    @Override
    public void run() { }

}
