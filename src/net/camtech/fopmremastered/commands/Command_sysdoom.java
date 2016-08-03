/*    */ package net.camtech.fopmremastered.commands;
/*    */ 
/*    */ import net.camtech.fopmremastered.FOPMR_Bans;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import net.camtech.fopmremastered.FreedomOpModRemastered;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ 
/*    */ public class Command_sysdoom
/*    */   extends FOPMR_Command
/*    */ {
/*    */   public Command_sysdoom()
/*    */   {
/* 25 */     super("sysdoom", "/sysdoom <player> <reason>", "Sysdoom!", FOPMR_Rank.Rank.OP);
/*    */   }
/*    */   
/*    */   public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 30 */     if (args.length < 1)
/*    */     {
/* 32 */       return false;
/*    */     }
/* 34 */     if (FOPMR_Rank.isSystem(sender))
/*    */     {
/* 36 */       String name = args[0];
/* 37 */       final Player player = FOPMR_Rank.getPlayer(args[0]);
/*    */       
/*    */ 
/* 40 */       if ((player.getName().equals("OxLemonxO") | player.getName().equals("DarkHorse108"))) {
/* 41 */         Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to sysdoom the co-owner or the owner.");
/* 42 */         return true;
/*    */       }
/* 44 */       if (FOPMR_Rank.isSystem(player))
/*    */       {
/* 46 */         sender.sendMessage(ChatColor.DARK_RED + "You cannot sysdoom this user!");
/* 47 */         return true;
/*    */       }
/*    */       
/* 50 */       final String reason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
/* 51 */       player.setGameMode(GameMode.SURVIVAL);
/* 52 */       player.setFireTicks(10000);
/* 53 */       player.setVelocity(player.getVelocity().clone().add(new Vector(0, 50, 0)));
/* 54 */       Bukkit.broadcastMessage(ChatColor.BLUE + sender.getName() + " - Systemdooming " + player.getName());
/* 55 */       Bukkit.broadcastMessage(ChatColor.YELLOW + sender.getName() + " - Systemdooming " + player.getName() + " into a never-ending oblivion.");
/* 56 */       Bukkit.broadcastMessage(ChatColor.DARK_RED + sender.getName() + " - Stupid rank of " + player.getName() + "'s, go away. Your rank is now gone, forever most likely.");
/* 57 */       FOPMR_Rank.setRank(player, FOPMR_Rank.Rank.OP, sender);
/* 58 */       Bukkit.broadcastMessage(ChatColor.BLUE + sender.getName() + " - Bye " + player.getName() + "!");
/*    */       
/* 60 */       new BukkitRunnable()
/*    */       {
/*    */ 
/*    */         public void run()
/*    */         {
/* 65 */           Bukkit.broadcastMessage(ChatColor.RED + "Up for some explosions, anyone?");
/* 66 */           player.getWorld().createExplosion(player.getLocation(), 10.0F, true);
/*    */           
/* 68 */           for (int i = 0; i < 100; i++)
/*    */           {
/* 70 */             player.getWorld().strikeLightning(player.getLocation());
/*    */           }
/* 72 */           player.setFireTicks(10000);
/* 73 */           player.setHealth(0.0D); } }
/*    */       
/* 75 */         .runTaskLater(FreedomOpModRemastered.plugin, 40L);
/*    */       
/* 77 */       new BukkitRunnable()
/*    */       {
/*    */ 
/*    */         public void run()
/*    */         {
/* 82 */           String finalreason = reason + "  PS: You are banned for 24-48 hours. You might be banned forever- theres'a chance. If you are banned forever - appeal at http://lemonfreedom.boards.net";
/* 83 */           FOPMR_Bans.addBan(player, finalreason, sender.getName()); } }
/*    */       
/* 85 */         .runTaskLater(FreedomOpModRemastered.plugin, 80L);
/*    */       
/* 87 */       return true;
/*    */     }
/*    */     
/*    */ 
/* 91 */     Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to use a system administration command.");
/* 92 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\commands\Command_sysdoom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */