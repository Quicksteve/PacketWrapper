package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerPlayerListHeaderFooter extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_LIST_HEADER_FOOTER;

    public WrapperPlayServerPlayerListHeaderFooter() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerPlayerListHeaderFooter(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedChatComponent getHeader() {
        return handle.getChatComponents().read(0);
    }

    public void setHeader(String value) {
        handle.getChatComponents().write(0, WrappedChatComponent.fromJson(value));
    }

    public WrappedChatComponent getFooter() {
        return handle.getChatComponents().read(1);
    }

    public void setFooter(String value) {
        handle.getChatComponents().write(1, WrappedChatComponent.fromJson(value));
    }
}
