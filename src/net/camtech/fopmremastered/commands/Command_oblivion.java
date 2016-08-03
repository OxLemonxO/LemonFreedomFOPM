/*    */ package net.camtech.fopmremastered.commands;
/*    */ 
/*    */ import net.camtech.camutils.CUtils_Methods;
/*    */ import net.camtech.fopmremastered.FOPMR_Bans;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import net.camtech.fopmremastered.FreedomOpModRemastered;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Command_oblivion extends FOPMR_Command
/*    */ {
/*    */   public Command_oblivion()
/*    */   {
/* 25 */     super("oblivion", "/oblivion <player> <reason>", "Unleash the DOOM...", FOPMR_Rank.Rank.ADMIN);
/*    */   }
/*    */   
/*    */   public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 30 */     if (args.length < 2) {
/* 31 */       return false;
/*    */     }
/* 33 */     if ((sender.getName().equals("xRave147") | sender.getName().equals("OxLemonxO"))) {
/* 34 */       String name = args[0];
/* 35 */       final Player player = FOPMR_Rank.getPlayer(args[0]);
/* 36 */       Player sender_p = FOPMR_Rank.getPlayer(sender.getName());
/* 37 */       final World world = player.getWorld();
/* 38 */       final Location loc = player.getLocation();
/* 39 */       final String reason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
/*    */       
/* 41 */       Bukkit.getScheduler().scheduleSyncDelayedTask(FreedomOpModRemastered.plugin, new BukkitRunnable()
/*    */       {
/*    */         public void run() {
/* 44 */           for (int i = 0; i < 1000; i++)
/* 45 */             Bukkit.broadcastMessage(CUtils_Methods.randomChatColor() + player.getName() + " is being a fucking moron."); } }, 40L);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 50 */       Bukkit.getScheduler().scheduleSyncDelayedTask(FreedomOpModRemastered.plugin, new BukkitRunnable()
/*    */       {
/*    */         public void run() {
/* 53 */           Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " is now obliterating " + player.getName() + " from all existence.");
/* 54 */           player.setGameMode(GameMode.SURVIVAL);
/* 55 */           player.chat("/god " + player.getName() + " off"); } }, 80L);
/*    */       
/*    */ 
/* 58 */       Bukkit.getScheduler().scheduleSyncDelayedTask(FreedomOpModRemastered.plugin, new BukkitRunnable()
/*    */       {
/*    */         public void run() {
/* 61 */           for (int i = 0; i < 50; i++)
/* 62 */             world.createExplosion(loc, 5.0F); } }, 100L);
/*    */       
/*    */ 
/*    */ 
/* 66 */       Bukkit.getScheduler().scheduleSyncDelayedTask(FreedomOpModRemastered.plugin, new BukkitRunnable()
/*    */       {
/*    */         public void run() {
/* 69 */           for (int i = 0; i < 1000; i++) {
/* 70 */             world.strikeLightning(loc);
/*    */           }
/*    */           
/* 73 */           FOPMR_Bans.addBan(player.getName(), reason, sender.getName());
/* 74 */           FOPMR_Rank.handleOblivionRank(player, FOPMR_Rank.Rank.OP, sender); } }, 120L);
/*    */       
/*    */ 
/*    */ 
/* 78 */       return true;
/*    */     }
/* 80 */     Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to use Glaze's command.");
/* 81 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\commands\Command_oblivion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */