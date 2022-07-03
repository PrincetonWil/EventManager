package rektclient.event.impl;

import net.minecraft.world.World;
import rektclient.event.Event;

public class WorldUnloaderEvent extends Event{
	
	private final World world;
	
	public WorldUnloaderEvent(World world) {
		this.world = world;
	}
	
	public World getWorld() {
		return world;
	}
	
}
