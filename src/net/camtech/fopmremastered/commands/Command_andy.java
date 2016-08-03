/*     */ package net.camtech.fopmremastered.commands;
/*     */ 
/*     */ import net.camtech.fopmremastered.FOPMR_Bans;
import net.camtech.fopmremastered.FOPMR_Rank;
/*     */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*     */ import net.camtech.fopmremastered.FreedomOpModRemastered;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
/*     */ import org.bukkit.util.Vector;
/*     */ 
/*     */ public class Command_andy extends FOPMR_Command
/*     */ {
/*     */   public Command_andy()
/*     */   {
/*  23 */     super("andy", "/andy <player> [reason]", "Slam the Andyhammer over someone!", FOPMR_Rank.Rank.ADMIN);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  29 */     if (args.length < 1)
/*     */     {
/*  31 */       return false;
/*     */     }
/*     */     
/*  34 */     if ((sender.getName().equals("AndySixx") | sender.getName().equals("DarkHorse108") | sender.getName().equals("OxLemonxO")))
/*     */     {
/*  36 */       String name = args[0];
/*  37 */       final Player player = net.camtech.fopmremastered.FOPMR_Rank.getPlayer(args[0]);
/*     */       
/*  39 */       final String reason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
/*     */       
/*  41 */       Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " - Andying " + player.getName() + ".");
/*  42 */       Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " - Andyhammering " + player.getName() + "!");
/*     */       
/*     */ 
/*  45 */       player.setOp(false);
/*     */       
/*     */ 
/*  48 */       player.setGameMode(GameMode.SURVIVAL);
/*     */       
/*     */ 
/*  51 */       player.setWhitelisted(false);
/*     */       
/*     */ 
/*  54 */       player.closeInventory();
/*     */       
/*     */ 
/*  57 */       player.getInventory().clear();
/*     */       
/*     */ 
/*  60 */       player.getWorld().createExplosion(player.getLocation(), 5.0F);
/*     */       
/*     */ 
/*  63 */       player.setHealth(0.0D);
/*     */       
/*  65 */       for (Player pl : Bukkit.getOnlinePlayers())
/*     */       {
/*     */ 
/*     */       }
/*     */       
/*  71 */       Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " - Shooting " + player.getName() + " off the planet to planet Andy!");
/*     */       
/*     */ 
/*  74 */       player.setVelocity(player.getVelocity().clone().add(new Vector(0, 100, 0)));
/*     */       
/*     */ 
/*  77 */       player.setFireTicks(10000);
/*     */       
/*  79 */       new BukkitRunnable()
/*     */       {
/*     */ 
/*     */ 
/*     */         public void run()
/*     */         {
/*     */ 
/*  86 */           for (int i = 0; i < 200; i++)
/*     */           {
/*  88 */             player.getWorld().strikeLightning(player.getLocation()); } } }
/*     */       
/*     */ 
/*     */ 
/*  92 */         .runTaskLater(FreedomOpModRemastered.plugin, 40L);
/*     */       
/*  94 *//*     *//*  94 */ BukkitTask runTaskLater;
    runTaskLater = new BukkitRunnable()
    /*     */       {
        /*     */
        /*     */         public void run()
        /*     */         {
            /*     */           {
                /*     */
            /*     */           }
            /*     */
            /*     */
            /* 106 */           player.chat("No!");
            /* 107 */           player.chat("Please AndySixx! Im sorry!");
            /* 108 */           player.chat("I'll do anything!");
            /* 109 */           Bukkit.broadcastMessage(ChatColor.DARK_RED + "AndySixx > Nope, no sorrys allowed, bye!"); } }
            /*     */
            /* 111 */         .runTaskLater(FreedomOpModRemastered.plugin, 60L);
 new BukkitRunnable()
/*     */       {
/*     */ 
/*     */         public void run()
/*     */         {
/* 118 */           String finalreason = reason + "  §cPS: You were Andy'd to death!";
/* 119 */           FOPMR_Bans.addBan(player, finalreason, sender.getName()); } }
/*     */       
/* 121 */         .runTaskLater(FreedomOpModRemastered.plugin, 80L);
/*     */       
/* 123 */       return true;
/*     */     }
/*     */     
/*     */ 
/* 127 */     Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to use AndySixx's command.");
/*     */     
/*     */ 
/* 130 */     return true;
/*     */   }
/*     */

    private static class pl {

        public pl() {
        }
    }
 }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\commands\Command_andy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */