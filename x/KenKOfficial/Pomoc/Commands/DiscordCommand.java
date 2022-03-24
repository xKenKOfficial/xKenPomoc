package x.KenKOfficial.Pomoc.Commands;

import org.bukkit.command.*;
import x.KenKOfficial.Pomoc.Utils.*;
import x.KenKOfficial.Pomoc.Main.*;
import org.bukkit.entity.*;
import java.util.*;

public class DiscordCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] args) {
        if (!Sender.hasPermission("xkenpomoc.discord")) {
            Sender.sendMessage(ChatUtil.fixColor("&3&lxKenPomoc &8>> &cNie masz dostepu do tej komendy!"));
            return false;
        }
        final List<String> discord = (List<String>)Main.getPlugin().getConfig().getStringList("Discord.Wiadomosc");
        String msg = "";
        if (Sender instanceof Player) {
            final Player p = (Player)Sender;
            for (int i = 0; i < discord.size(); ++i) {
                msg = String.valueOf(discord.get(i));
                p.sendMessage(ChatUtil.fixColor(msg));
            }
        }
        return false;
    }
}
