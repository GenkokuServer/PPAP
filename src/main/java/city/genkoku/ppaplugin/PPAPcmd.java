package city.genkoku.ppaplugin;

import city.genkoku.ppaplugin.command.User;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

public class PPAPcmd extends Command implements TabExecutor {
    private PPAPcmd command;

    public PPAPcmd(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        sender.sendMessage(new TextComponent("POOP!"));
        if (args.length == 0) {
            sender.sendMessage(new TextComponent("だまれ"));
            return;
        }
        switch (args[0].toLowerCase()) {
            case "user":
                User.execute(sender, args);
                break;
            case "cmd":
                break;
            default:
                sender.sendMessage(new TextComponent("おばか"));
                return;
        }
    }

    @Override
    public Iterable<String> onTabComplete(CommandSender sender, String[] args) {
        return null;
    }
}
