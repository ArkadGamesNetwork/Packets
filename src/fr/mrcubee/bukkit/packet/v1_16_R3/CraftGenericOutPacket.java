package fr.mrcubee.bukkit.packet.v1_16_R3;

import fr.mrcubee.bukkit.packet.GenericOutPacket;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * @author MrCubee
 */
public abstract class CraftGenericOutPacket extends CraftGenericPacket implements GenericOutPacket {

    @Override
    public boolean sendPlayer(Player player) {
        if (player == null || !player.isOnline())
            return false;
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(this.packet);
        return true;
    }
}
