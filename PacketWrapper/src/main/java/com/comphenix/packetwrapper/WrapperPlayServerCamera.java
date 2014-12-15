package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCamera extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CAMERA;

    public WrapperPlayServerCamera() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerCamera(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getCameraID() {
        return handle.getIntegers().read(0);
    }

    public void setCameraID(int value) {
        handle.getIntegers().write(0, value);
    }
}
