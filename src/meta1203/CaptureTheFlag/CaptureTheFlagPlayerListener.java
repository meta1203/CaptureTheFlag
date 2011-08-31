package meta1203.CaptureTheFlag;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.getspout.spoutapi.SpoutManager;

/**
 * Handle events for all Player related events
 * @author meta1203
 */
public class CaptureTheFlagPlayerListener extends PlayerListener {
    private final CaptureTheFlag plugin;

    public CaptureTheFlagPlayerListener(CaptureTheFlag instance) {
        plugin = instance;
    }

    //Insert Player related code here
    public void onPlayerInteract(PlayerInteractEvent event) {
    	SpoutPlayer scp = SpoutManager.getPlayer(event.getPlayer());
    	
    	scp.setWalkingMultiplier(2);
    }
}

