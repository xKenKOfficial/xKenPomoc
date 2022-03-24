package x.KenKOfficial.Pomoc.Listeners;

import org.bukkit.event.player.*;
import x.KenKOfficial.Pomoc.Main.*;
import org.bukkit.*;
import x.KenKOfficial.Pomoc.Utils.*;
import org.bukkit.entity.*;
import java.util.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        if (Main.getPlugin().getConfig().getBoolean("Wysylanie_Wiadomosci_Powitalnej")) {
            final List<String> wiadomosc = (List<String>)Main.getPlugin().getConfig().getStringList("Gdy_Gracz_Wbija.Wiadomosc");
            String msg = "";
            for (int i = 0; i < wiadomosc.size(); ++i) {
                msg = String.valueOf(wiadomosc.get(i).replace("{ONLINE}", String.valueOf(Bukkit.getOnlinePlayers().size())).replace("{Player}", p.getName()).replace("{IP}", String.valueOf(p.getAddress().getAddress().getHostAddress())));
                p.sendMessage(ChatUtil.fixColor(msg));
            }
        }
        if (p.hasPermission("xkenpomoc.admin")) {
            p.sendMessage(ChatUtil.fixColor("&8&l===============[&3&lxKenPomoc&8&l]==============="));
            p.sendMessage(ChatUtil.fixColor(" "));
            p.sendMessage(ChatUtil.fixColor(" &7Plugin&8: &bxKenPomoc"));
            p.sendMessage(ChatUtil.fixColor(" "));
            p.sendMessage(ChatUtil.fixColor(" &7Wersja&8: &b1.0-Beta"));
            p.sendMessage(ChatUtil.fixColor(" "));
            p.sendMessage(ChatUtil.fixColor(" &7Ostatni UpDate&8: &b19.04.2021 godz. 03:14"));
            p.sendMessage(ChatUtil.fixColor(" "));
            p.sendMessage(ChatUtil.fixColor("&8&l===============[&3&lxKenPomoc&8&l]==============="));
        }
    }
}
