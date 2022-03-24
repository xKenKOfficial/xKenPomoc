package x.KenKOfficial.Pomoc.Main;

import org.bukkit.plugin.java.*;
import org.bukkit.command.*;
import x.KenKOfficial.Pomoc.Commands.*;
import org.bukkit.*;
import x.KenKOfficial.Pomoc.Listeners.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class Main extends JavaPlugin
{
    private static Main plugin;
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        System.out.println("###########################################################");
        System.out.println("xKenPomoc");
        System.out.println("Wersja: 1.0-Beta");
        System.out.println("Aktywowany!");
        System.out.println("Wszelkie Edycje i Naruszanie Praw Autorskich - ZABRONIONE!");
        System.out.println("###########################################################");
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println("###########################################################");
        System.out.println("xKenPomoc");
        System.out.println("Wersja: 1.0-Beta");
        System.out.println("Wylaczony!");
        System.out.println("Wszelkie Edycje i Naruszanie Praw Autorskich - ZABRONIONE!");
        System.out.println("###########################################################");
    }
    
    public void registerCommands() {
        this.getLogger().info("Ladowanie Komend z pluginu xKenPomoc...");
        this.getCommand("discord").setExecutor((CommandExecutor)new DiscordCommand());
        this.getCommand("pomoc").setExecutor((CommandExecutor)new PomocCommand());
        this.getCommand("regulamin").setExecutor((CommandExecutor)new RegulaminCommand());
        this.getCommand("administracja").setExecutor((CommandExecutor)new AdministracjaCommand());
    }
    
    public void registerListeners() {
        this.getLogger().info("Ladowanie Eventow z pluginu xKenPomoc...");
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
}
