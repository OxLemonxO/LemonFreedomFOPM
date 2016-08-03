/*    */ package net.camtech.fopmremastered.commands;
/*    */ 
import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ 
/*    */ public class Command_rage extends FOPMR_Command
/*    */ {
/*    */   public Command_rage()
/*    */   {
/* 16 */     super("rage", "/rage [-f]", "Explode with rage!", FOPMR_Rank.Rank.SUPER);
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 22 */     Player player = (Player)sender;
/*    */     
/* 24 */     if (!args[0].equalsIgnoreCase("-f"))
/*    */     {
/* 26 */       Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has exploded with rage!");
/* 27 */       player.getInventory().clear();
/* 28 */       player.getWorld().createExplosion(player.getLocation(), 5.0F);
/*    */       
/*    */ 
/* 31 */       player.setHealth(0.0D);
/* 32 */       return true;
/*    */     }
/*    */     
/* 35 */     if (args[0].equalsIgnoreCase("-f"))
/*    */     {
/* 37 */       Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has exploded with " + ChatColor.DARK_RED + "fiery " + ChatColor.RED + "rage!");
/* 38 */       player.getInventory().clear();
/* 39 */       player.getWorld().createExplosion(player.getLocation(), 5.0F);
/*    */       
/*    */ 
/*    */ 
/* 43 */       player.setHealth(0.0D);
/* 44 */       return true;
/*    */     }
/*    */     
/* 47 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\commands\Command_rage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */