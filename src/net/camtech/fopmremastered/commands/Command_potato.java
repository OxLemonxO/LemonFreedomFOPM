/*    */ package net.camtech.fopmremastered.commands;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import java.util.ArrayList;
/*    */ import net.camtech.fopmremastered.FOPMR_Bans;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import net.camtech.fopmremastered.FreedomOpModRemastered;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ 
/*    */ public class Command_potato extends FOPMR_Command
/*    */ {
/*    */   public Command_potato()
/*    */   {
/* 24 */     super("potato", "/potato [[give | ban] [username] [reason]", "Potatoes.", FOPMR_Rank.Rank.OP);
/*    */   }
/*    */   
/*    */   public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 29 */     if ((sender.getName().equals("OxLemonxO") | sender.getName().equals("MashedPtatoz") | sender.getName().equals("DarkHorse108") | sender.getName().equals("SupItsDillon")))
/*    */     {
/* 31 */       if (args.length == 2) {
/* 32 */         Player player = FOPMR_Rank.getPlayer(args[1]);
/* 33 */         if (player == null) {
/* 34 */           sender.sendMessage("Player: " + args[1] + " is not online.");
/* 35 */           return true;
/*    */         }
/* 37 */         if (args[0].equalsIgnoreCase("give")) {
/* 38 */           Bukkit.broadcastMessage(ChatColor.AQUA + "MashedPtatoz - Showering " + player.getName() + " in delicious potatoes!");
/* 39 */           ItemStack potato = new ItemStack(Material.POTATO);
/* 40 */           ItemMeta potatometa = potato.getItemMeta();
/* 41 */           potatometa.setDisplayName("Potato");
/* 42 */           ArrayList PotatoLore = new ArrayList();
/* 43 */           PotatoLore.add("Given to you by - " + sender.getName());
/* 44 */           potatometa.setLore(PotatoLore);
/* 45 */           potato.setItemMeta(potatometa);
/* 46 */           for (int i = 0; i < 1000; i++) {
/* 47 */             player.getInventory().addItem(new ItemStack[] { potato });
/*    */           }
/*    */         }
/* 50 */         return false;
/*    */       }
/* 52 */       if ((args.length >= 3) && 
/* 53 */         (args[0].equalsIgnoreCase("ban")))
/*    */       {
/* 55 */         final Player player = FOPMR_Rank.getPlayer(args[1]);
/* 56 */         if (player == null) {
/* 57 */           sender.sendMessage("Player: " + args[1] + " is not online.");
/* 58 */           return true;
/*    */         }
/*    */         
/* 61 */         final String reason = args[2];
/* 62 */         if (reason == null) {
/* 63 */           sender.sendMessage(ChatColor.RED + "Please specify a reason.");
/* 64 */           return true;
/*    */         }
/* 66 */         Bukkit.broadcastMessage(ChatColor.DARK_RED + "MashedPtatoz - Showering " + player.getName() + " in malicious potatoes!");
/*    */         
/* 68 */         new BukkitRunnable()
/*    */         {
/*    */           public void run() {
/* 71 */             Bukkit.broadcastMessage(ChatColor.DARK_RED + "Crushing " + player.getName() + "'s skull...");
/* 72 */             player.setHealth(0.0D);
/* 73 */             for (int i = 0; i < 100; i++)
/* 74 */               player.getWorld().strikeLightning(player.getLocation()); } }
/*    */         
/*    */ 
/* 77 */           .runTaskLater(FreedomOpModRemastered.plugin, 40L);
/* 78 */         new BukkitRunnable()
/*    */         {
/*    */           public void run() {
/* 81 */             Bukkit.broadcastMessage(ChatColor.DARK_RED + "MashedPtatoz - Banning " + player.getName() + "and IPs: " + player.getPlayer().getAddress().getAddress().getHostAddress().trim());
/* 82 */             for (int i = 0; i < 100; i++) {
/* 83 */               player.getWorld().strikeLightning(player.getLocation());
/*    */             }
/*    */             
/* 86 */             FOPMR_Bans.addBan(player, reason, sender.getName()); } }
/*    */         
/*    */ 
/* 89 */           .runTaskLater(FreedomOpModRemastered.plugin, 63L);
/*    */       }
/*    */     }
/*    */     else {
/* 93 */       Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "LFM" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + " has tried to use MashedPtatoz's command.");
/*    */     }
/* 95 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\commands\Command_potato.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */