/*    */ package net.camtech.fopmremastered.commands;
/*    */ 
import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Command_insult extends FOPMR_Command
/*    */ {
/*    */   public Command_insult()
/*    */   {
/* 16 */     super("insult", "/insult <player>", "Insults the player. Brick Tamland Style. Used against trolls", FOPMR_Rank.Rank.SENIOR);
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 21 */     if (args.length == 0)
/*    */     {
/* 23 */       return false;
/*    */     }
/*    */     
/* 26 */     Player player = net.camtech.fopmremastered.FOPMR_Rank.getPlayer(args[0]);
/*    */     
/* 28 */     if (player == null)
/*    */     {
/* 30 */       sender.sendMessage(ChatColor.GRAY + "Player not found!");
/* 31 */       return true;
/*    */     }
/*    */     
/* 34 */     player.setOp(false);
/* 35 */     player.setGameMode(GameMode.SURVIVAL);
/* 36 */     player.setFireTicks(10000);
/* 37 */     for (int i = 0; i < 100; i++)
/*    */     {
/* 39 */       player.getWorld().strikeLightning(player.getLocation());
/*    */     }
/* 41 */     player.setHealth(0.0D);
/* 42 */     Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Hey " + player.getName() + ", where did you get those clothes from?? The..toilet...store??");
/* 43 */     for (int i = 0; i < 100; i++)
/*    */     {
/* 45 */       player.getWorld().strikeLightning(player.getLocation());
/*    */     }
/* 47 */     Bukkit.broadcastMessage(ChatColor.WHITE + player.getName() + " died.");
/* 48 */     Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + player.getName() + " smells like a big bunch of faggots.");
/* 49 */     for (int i = 0; i < 100; i++)
/*    */     {
/* 51 */       player.getWorld().strikeLightning(player.getLocation());
/*    */     }
/* 53 */     Bukkit.broadcastMessage(ChatColor.WHITE + player.getName() + " died.");
/* 54 */     Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Hey " + player.getName() + ", if you're from africa, why are you white??");
/* 55 */     for (int i = 0; i < 100; i++)
/*    */     {
/* 57 */       player.getWorld().strikeLightning(player.getLocation());
/*    */     }
/* 59 */     Bukkit.broadcastMessage(ChatColor.WHITE + player.getName() + " died.");
/* 60 */     Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Oh, im sorry " + player.getName() + " did my hand wrist slip and hit you?");
/* 61 */     for (int i = 0; i < 100; i++)
/*    */     {
/* 63 */       player.getWorld().strikeLightning(player.getLocation());
/*    */     }
/* 65 */     Bukkit.broadcastMessage(ChatColor.WHITE + player.getName() + " died.");
/* 66 */     Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Hey " + player.getName() + ", did you know we've had vicious noobs and idiot noobs?");
/* 67 */     for (int i = 0; i < 100; i++)
/*    */     {
/* 69 */       player.getWorld().strikeLightning(player.getLocation());
/*    */     }
/* 71 */     Bukkit.broadcastMessage(ChatColor.WHITE + player.getName() + " died.");
/* 72 */     Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "But we've never had vicious idiot noobs like you.");
/*    */     
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\commands\Command_insult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */