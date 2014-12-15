package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetCompression extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_COMPRESSION;

    public WrapperPlayServerSetCompression() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerSetCompression(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getThreshold() {
        return handle.getIntegers().read(0);
    }

    public void setThreshold(int value) {
        handle.getIntegers().write(0, value);
    }
}
