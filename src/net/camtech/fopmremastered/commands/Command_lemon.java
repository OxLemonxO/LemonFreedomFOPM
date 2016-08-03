/*    */ package net.camtech.fopmremastered.commands;
/*    */ 
/*    */ import net.camtech.fopmremastered.FOPMR_Bans;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Command_lemon
/*    */   extends FOPMR_Command
/*    */ {
/*    */   public Command_lemon()
/*    */   {
/* 21 */     super("lemon", "/lemon <player> <reason>", "Unleash the DOOM...", FOPMR_Rank.Rank.ADMIN);
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 26 */     if (args.length < 2)
/*    */     {
/* 28 */       return false;
/*    */     }
/* 30 */     if ((sender.getName().equals("DarkHorse108") | sender.getName().equals("OxLemonxO") | sender.getName().equals("KM_Galahad")))
/*    */     {
/* 32 */       String name = args[0];
/* 33 */       Player player = FOPMR_Rank.getPlayer(args[0]);
/* 34 */       if (FOPMR_Rank.isOwner(player)) {
/* 35 */         Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to doom the co-owner or the owner.");
/* 36 */         return false;
/*    */       }
/*    */       
/*    */ 
/* 40 */       String reason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
/* 41 */       Bukkit.broadcastMessage(ChatColor.BLUE + sender.getName() + " - Lemonading " + player.getName());
/* 42 */       Bukkit.broadcastMessage(ChatColor.YELLOW + "OxLemonxO is squeezing " + player.getName() + " into a tasty lemonade!");
/* 43 */       Bukkit.broadcastMessage(ChatColor.YELLOW + "Yummy Lemonade!");
/* 44 */       Bukkit.broadcastMessage(ChatColor.RED + "OxLemonxO is stripping " + player.getName() + " of all their ranks.");
/* 45 */       FOPMR_Rank.handleLemonRank(player, FOPMR_Rank.Rank.OP, sender);
/* 46 */       Bukkit.broadcastMessage(ChatColor.RED + "CANNONBALL!");
/* 47 */       Bukkit.broadcastMessage(ChatColor.YELLOW + "Lemonade, anyone?");
/* 48 */       Bukkit.broadcastMessage(ChatColor.AQUA + "Bye " + player.getName() + "!");
/* 49 */       String finalreason = reason + "  PS: You have been lemonaded by the mighty OxLemonxO!";
/* 50 */       FOPMR_Bans.HandleLemonBan(player, finalreason, sender.getName());
/* 51 */       return true;
/*    */     }
/*    */     
/* 54 */     Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to use OxLemonxO's command.");
/* 55 */     return false;
/*    */   }
/*    */ }
