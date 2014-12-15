package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerResourcePackSend extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RESOURCE_PACK_SEND;

    public WrapperPlayServerResourcePackSend() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerResourcePackSend(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getURL() {
        return handle.getStrings().read(0);
    }

    public void setURL(String value) {
        handle.getStrings().write(0, value);
    }

    public String getHash() {
        return handle.getStrings().read(1);
    }

    public void setHash(String value) {
        handle.getStrings().write(1, value);
    }
}
