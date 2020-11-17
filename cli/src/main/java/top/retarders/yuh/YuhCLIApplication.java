package top.retarders.yuh;

import io.airlift.airline.Cli;
import top.retarders.yuh.command.HelpCommand;

public class YuhCLIApplication {

    public static void main(String[] args) {
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("yuh")
                .withDescription("the spigot plugin development framework")
                .withDefaultCommand(HelpCommand.class)
                .withCommand(HelpCommand.class);

        Cli<Runnable> parser = builder.build();
        parser.getMetadata().getCommandGroups().forEach(o->o.getCommands().forEach(i-> System.out.println(i.getName())));
        parser.parse(args).run();
    }

}
