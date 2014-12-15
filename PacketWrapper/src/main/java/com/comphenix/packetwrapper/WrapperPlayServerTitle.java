package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerTitle extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TITLE;

    public WrapperPlayServerTitle() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerTitle(PacketContainer packet) {
        super(packet, TYPE);
    }

    public EnumWrappers.TitleAction getTitleAction() {
        return handle.getTitleActions().read(0);
    }

    public void setTitleAction(EnumWrappers.TitleAction value) {
        handle.getTitleActions().write(0, value);
    }

    public WrappedChatComponent getTitleSubtile() {
        return handle.getChatComponents().read(0);
    }

    public void setTitleSubtitle(String value) {
        handle.getChatComponents().write(0, WrappedChatComponent.fromJson(value));
    }

    public int getFadeIn() {
        return handle.getIntegers().read(0);
    }

    public void setFadeIn(int value) {
        handle.getIntegers().write(0, value);
    }

    public int getStay() {
        return handle.getIntegers().read(1);
    }

    public void setStay(int value) {
        handle.getIntegers().write(1, value);
    }

    public int getFadeOut() {
        return handle.getIntegers().read(2);
    }

    public void setFadeOut(int value) {
        handle.getIntegers().write(2, value);
    }
}
