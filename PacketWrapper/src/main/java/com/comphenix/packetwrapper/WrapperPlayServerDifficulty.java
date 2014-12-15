package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;

public class WrapperPlayServerDifficulty extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SERVER_DIFFICULTY;

    public WrapperPlayServerDifficulty() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerDifficulty(PacketContainer packet) {
        super(packet, TYPE);
    }

    public EnumWrappers.Difficulty getDifficulty() {
        return handle.getDifficulties().read(0);
    }

    public void setDifficulty(EnumWrappers.Difficulty value) {
        handle.getDifficulties().write(0, value);
    }
}
