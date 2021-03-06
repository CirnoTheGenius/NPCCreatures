package ch.spacebase.npccreatures.npcs.nms;

import java.util.ConcurrentModificationException;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.AxisAlignedBB;
import net.minecraft.server.DamageSource;
import net.minecraft.server.EntityEnderDragon;
import net.minecraft.server.Packet34EntityTeleport;
import net.minecraft.server.World;

public class NPCEnderDragon extends EntityEnderDragon {

	public NPCEnderDragon(World world) {
		super(world);
	}

	public void setBukkitEntity(org.bukkit.entity.Entity entity) {
		this.bukkitEntity = entity;
	}

	@Override
	public void move(double arg0, double arg1, double arg2) {
	}

	@Override
	public boolean damageEntity(DamageSource source, int damage) {
		return false;
	}

	@Override
	public void die() {
	}

	// PathFinding
	@Override
	protected void d_() {
	}

	// Movement?
	@Override
	public void e() {
		try {
			final Location loc = this.getBukkitEntity().getLocation();
			final List<Player> players = this.world.getWorld().getPlayers();
			final Packet34EntityTeleport packet = new Packet34EntityTeleport(this);

			for (Player player : players) {
				if (player.getLocation().distanceSquared(loc) < 4096) {
					((CraftPlayer) player).getHandle().netServerHandler.sendPacket(packet);
				}
			}
		} catch (ConcurrentModificationException ex) {
		}

		return;
	}

	// EnderCrystal link?
	@SuppressWarnings("unused")
	private void A() {
	}

	// ???
	@SuppressWarnings({ "unused", "rawtypes" })
	private void a(List list) {
	}

	// ???
	@SuppressWarnings({ "unused", "rawtypes" })
	private void b(List list) {
	}

	// Explosions
	@SuppressWarnings("unused")
	private boolean a(AxisAlignedBB axisalignedbb) {
		return false;
	}

	// Explosions
	@Override
	protected void aB() {
	}

	// #winning
	@SuppressWarnings("unused")
	private void a(int i, int j) {
	}

}
