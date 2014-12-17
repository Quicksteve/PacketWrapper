package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;

public class WrapperPlayServerWorldBorder extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.WORLD_BORDER;

    public WrapperPlayServerWorldBorder() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerWorldBorder(PacketContainer packet) {
        super(packet, TYPE);
    }

    public EnumWrappers.WorldBorderAction getWorldBorderAction() {
        return handle.getWorldBorderActions().read(0);
    }

    public void setWorldBorderAction(EnumWrappers.WorldBorderAction value) {
        handle.getWorldBorderActions().write(0, value);
    }

    public int getSize() {
        return handle.getIntegers().read(0);
    }

    public void setSize(int value) {
        handle.getIntegers().write(0, value);
    }

    public double getCenterX() {
        return handle.getDoubles().read(0);
    }

    public void setCenterX(double value) {
        handle.getDoubles().write(0, value);
    }

    public double getCenterZ() {
        return handle.getDoubles().read(1);
    }

    public void setCenterZ(double value) {
        handle.getDoubles().write(1, value);
    }

    public double getTargetSize() {
        return handle.getDoubles().read(2);
    }

    public void setTargetSize(double value) {
        handle.getDoubles().write(2, value);
    }

    public double getDiameter() {
        return handle.getDoubles().read(3);
    }

    public void setDiameter(double value) {
        handle.getDoubles().write(3, value);
    }

    public long getTimeUntilTarget() {
        return handle.getLongs().read(0);
    }

    public void setTimeUntilTarget(long value) {
        handle.getLongs().write(0, value);
    }

    public int getWarningTime() {
        return handle.getIntegers().read(1);
    }

    public void setWarningTime(int value) {
        handle.getIntegers().write(1, value);
    }

    public int getWarningDistance() {
        return handle.getIntegers().read(2);
    }

    public void setWarningDistance(int value) {
        handle.getIntegers().write(2, value);
    }
}
