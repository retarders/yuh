package top.retarders.yuh.command;

import io.airlift.airline.Command;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang.StringUtils.*;

@Command(
        name = "help",
        description = "provides help with yuh"
)
public class HelpCommand implements Runnable {

    public static final List<Class<? extends Runnable>> COMMANDS = Arrays.asList(
            HelpCommand.class,
            NewCommand.class,
            GenerateCommand.class
    );

    @Override
    public void run() {
        System.out.println("Available Commands:");

        COMMANDS.forEach(command -> {
            Command commandAnnotation = command.getAnnotation(Command.class);

            System.out.println(String.format("  %s %s", commandAnnotation.name(), capitalize(commandAnnotation.description())));
        });
    }

}
