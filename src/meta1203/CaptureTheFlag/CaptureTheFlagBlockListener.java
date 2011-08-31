package meta1203.CaptureTheFlag;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * CaptureTheFlag block listener
 * @author meta1203
 */
public class CaptureTheFlagBlockListener extends BlockListener {
    private final CaptureTheFlag plugin;

    public CaptureTheFlagBlockListener(final CaptureTheFlag plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}
