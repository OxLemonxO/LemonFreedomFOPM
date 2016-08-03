/*    */ package net.camtech.fopmremastered.listeners;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank;
/*    */ import net.camtech.fopmremastered.FOPMR_Rank.Rank;
/*    */ import net.camtech.fopmremastered.FreedomOpModRemastered;
/*    */ import net.camtech.verification.CamVerifyEvent;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitTask;
/*    */ 
/*    */ public class FOPMR_CamVerifyListener implements Listener
/*    */ {
/*    */   public FOPMR_CamVerifyListener()
/*    */   {
/* 23 */     if (!Bukkit.getPluginManager().isPluginEnabled("CamVerify"))
/*    */     {
/* 25 */       Bukkit.broadcastMessage(ChatColor.RED + "CamVerify cannot be found, disabling integration.");
/* 26 */       return;
/*    */     }
/* 28 */     Bukkit.getPluginManager().registerEvents(this, FreedomOpModRemastered.plugin);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ /*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void close(PrintWriter out, final BufferedReader in)
/*    */   {
/* 48 */
    BukkitTask runTaskLater;
/*    */
    runTaskLater = new org.bukkit.scheduler.BukkitRunnable()
    /*    */     {
        /*    */       public void run()
        /*    */       {
            /*    */         try
            /*    */         {
                /* 42 */           in.close();
            /*    */         }
            /*    */         catch (IOException ex) {
                /* 45 */           Logger.getLogger(FOPMR_CamVerifyListener.class.getName()).log(Level.SEVERE, null, ex); } } 

        class val$out {

             void close() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public val$out() {
            }
        }
    }
            /*    */
            /*    */
            /* 48 */       .runTaskLater(FreedomOpModRemastered.plugin, 40L);
   }
/*    */   
/*    */ /*    */   
/*    */ 
/*    */   @EventHandler
/*    */   public void onVerify(CamVerifyEvent event)
/*    */   {
/* 55 */     BufferedReader in = event.getIn();
/* 56 */     PrintWriter out = event.getOut();
/* 57 */     String ip = event.getIp();
/*    */     /*    */     
/*    */     try
/*    */     {
/* 61 */       if (!"5.135.233.93".equalsIgnoreCase(ip))
/*    */       {
/* 63 */         out.println("You are the wrong host, you are " + ip + " not 5.135.233.93");
/* 64 */         close(out, in);
/* 65 */         return;
/*    */       }
/* 67 */       String name = in.readLine();
/* 68 */       Player player = Bukkit.getPlayer(name);
/* 69 */       if (player == null)
/*    */       {
/* 71 */         out.println(name + " is not a valid player.");
/* 72 */         close(out, in);
/* 73 */         return;
/*    */       }
/* 75 */       if (FOPMR_Rank.getRank(player) == FOPMR_Rank.Rank.IMPOSTER)
/*    */       {
/* 77 */         FOPMR_Rank.unImposter(player);
/* 78 */         out.println(name + " has been successfully verified.");
/* 79 */         close(out, in);
/* 80 */         Bukkit.broadcastMessage(ChatColor.AQUA + name + " has been verified using CamVerify!");
/* 81 */         return;
/*    */       }
/* 83 */       out.println(name + " is not an imposter.");
/* 84 */       close(out, in);
/*    */     }
/*    */     catch (IOException ex) {
/* 87 */       Logger.getLogger(FOPMR_CamVerifyListener.class.getName()).log(Level.SEVERE, null, ex);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Dillon\Downloads\LemonFreedomMod.jar!\net\camtech\fopmremastered\listeners\FOPMR_CamVerifyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */