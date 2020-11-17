package top.retarders.yuh.command;

import io.airlift.airline.Command;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;

import static org.apache.commons.lang.StringUtils.*;

@Command(
        name = "help",
        description = "provides help with yuh"
)
public class HelpCommand implements Runnable {

    /**
     * Defines the commands list
     */
    public static final HashMap<String, String> COMMANDS = new HashMap<String, String>() {{
        put("new", "creates a new yuh project");
        put("generate", "generates a new component");
    }};

    @Override
    public void run() {
        System.out.println("Available Commands:");

        COMMANDS.forEach((name, description) -> System.out.println(String.format("  %s %s", name, capitalize(description))));
    }

}
