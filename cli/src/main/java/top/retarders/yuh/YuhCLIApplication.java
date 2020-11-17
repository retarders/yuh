package top.retarders.yuh;

import io.airlift.airline.Cli;
import top.retarders.yuh.command.GenerateCommand;
import top.retarders.yuh.command.HelpCommand;
import top.retarders.yuh.command.NewCommand;

public class YuhCLIApplication {

    public static void main(String[] args) {
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("yuh")
                .withDescription("the spigot plugin development framework")
                .withDefaultCommand(HelpCommand.class)
                .withCommands(HelpCommand.class, NewCommand.class, GenerateCommand.class);

        Cli<Runnable> parser = builder.build();
        parser.parse(args).run();
    }

}
