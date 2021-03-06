package ch.spacebase.npccreatures.npcs.entity;

import ch.spacebase.npccreatures.npcs.nms.NPCCreeper;

/**
 * Represents a Creeper NPC.
 */
public class CreeperNPC extends BaseNPC {

	public CreeperNPC(NPCCreeper entity, String name) {
		super(entity, name);
		entity.setBukkitEntity(this);
	}

	/**
	 * Sets the powered state of the NPC.
	 * 
	 * @param Whether
	 *            the NPC is powered or not.
	 */
	public void setPowered(boolean powered) {
		((NPCCreeper) this.entity).setPowered(powered);
	}

	/**
	 * Gets the powered state of the NPC.
	 * 
	 * @return The powered state of the NPC.
	 */
	public boolean isPowered() {
		return ((NPCCreeper) this.entity).isPowered();
	}

}
