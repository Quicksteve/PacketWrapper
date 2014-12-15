package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;

public class WrapperPlayServerCombatEvent extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.COMBAT_EVENT;

    public WrapperPlayServerCombatEvent() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerCombatEvent(PacketContainer packet) {
        super(packet, TYPE);
    }

    public EnumWrappers.CombatEventType getCombatEventType() {
        return handle.getCombatEvents().read(0);
    }

    public void setCombatEventType(EnumWrappers.CombatEventType value) {
        handle.getCombatEvents().write(0, value);
    }

    public int getDuration() {
        return handle.getIntegers().read(0);
    }

    public void setDuration(int value) {
        handle.getIntegers().write(0, value);
    }

    public int getEntityID() {
        return handle.getIntegers().read(1);
    }

    public void setEntityID(int value) {
        handle.getIntegers().write(1, value);
    }

    public int getPlayerID() {
        return handle.getIntegers().read(2);
    }

    public void setPlayerID(int value) {
        handle.getIntegers().write(2, value);
    }

    public String getMessage() {
        return handle.getStrings().read(0);
    }

    public void setMessage(String value) {
        handle.getStrings().write(0, value);
    }
}
