package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.nbt.NbtCompound;

public class WrapperPlayServerUpdateEntityNBT extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_ENTITY_NBT;

    public WrapperPlayServerUpdateEntityNBT() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerUpdateEntityNBT(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityID() {
        return handle.getIntegers().read(0);
    }

    public void setEntityID(int value) {
        handle.getIntegers().write(0, value);
    }

    public NbtCompound getTag() {
        return (NbtCompound) handle.getNbtModifier().read(0);
    }

    public void setTag(NbtCompound value) {
        handle.getNbtModifier().write(0, value);
    }
}
