package de.hglabor.soupcore.interfaces;

import de.hglabor.plugins.kitapi.supplier.KitPlayerSupplier;
import org.bukkit.entity.Entity;

import java.util.List;

public interface IPlayerList extends KitPlayerSupplier {
    List<Entity> getTrackingTargets();
}
