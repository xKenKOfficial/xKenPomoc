package x.KenKOfficial.Pomoc.Commands;

import org.bukkit.command.*;
import x.KenKOfficial.Pomoc.Utils.*;
import x.KenKOfficial.Pomoc.Main.*;
import org.bukkit.entity.*;
import java.util.*;

public class RegulaminCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender Sender, final Command Cmd, final String Label, final String[] args) {
        if (!Sender.hasPermission("xkenpomoc.regulamin")) {
            Sender.sendMessage(ChatUtil.fixColor("&3&lxKenPomoc &8>> &cNie masz dostepu do tej komendy!"));
            return false;
        }
        final List<String> regulamin = (List<String>)Main.getPlugin().getConfig().getStringList("Regulamin.Wiadomosc");
        String msg = "";
        if (Sender instanceof Player) {
            final Player p = (Player)Sender;
            for (int i = 0; i < regulamin.size(); ++i) {
                msg = String.valueOf(regulamin.get(i));
                p.sendMessage(ChatUtil.fixColor(msg));
            }
        }
        return false;
    }
}
