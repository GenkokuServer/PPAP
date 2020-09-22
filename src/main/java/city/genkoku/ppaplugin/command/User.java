package city.genkoku.ppaplugin.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class User {
    public static void execute(CommandSender sender, String[] args) {
        if (args.length < 2) {
            sender.sendMessage(new TextComponent("ぼけが"));
            return;
        }
        switch (args[1].toLowerCase()) {
            case "add":
            case "delete":
            case "lookup":
                if (args.length < 3) {
                    sender.sendMessage(new TextComponent("ばかたれが"));
                } else {
                    String uuid = "cccdb808-d815-4dcd-91a9-66aab2136f17";
                    switch (args[1].toLowerCase()) {
                        case "add":
                            add(sender, uuid);
                            break;
                        case "delete":
                            delete(sender, uuid);
                            break;
                        case "lookup":
                            lookup(sender, uuid);
                            break;
                    }
                }
                break;
            case "list":
                int listIndex;
                if (args.length < 3) {
                    listIndex = 1;
                } else {
                    try {
                        listIndex = Integer.parseInt(args[2]);
                    } catch (NumberFormatException e) {
                        sender.sendMessage(new TextComponent("小学校で数字から学びなおして来い"));
                        return;
                    }
                }
                list(sender, listIndex);
                break;
            default:
                sender.sendMessage(new TextComponent("あほ"));
        }
    }
    public static void add(CommandSender sender, String uuid) {
        sender.sendMessage(new TextComponent("add!!!!!!!!!!"));
        return;
    }

    public static void delete(CommandSender sender, String uuid) {
        sender.sendMessage(new TextComponent("delete!!!!!!!!!!!!!!!!!!!!!"));
        return;
    }

    public static void lookup(CommandSender sender, String uuid) {
        sender.sendMessage(new TextComponent("lookup!!!!!!!"));
        return;
    }

    public static void list(CommandSender sender, int pageIndex) {
        sender.sendMessage(new TextComponent("list!!!!!!!!!!"));
        return;
    }
}
