package com.Zrips.CMI.Modules.TabList;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class TabListHeaderFooterHandler {
    private Version version = Version.v1_11_R1;
    private Method getHandle;
    private Method sendPacket;
    private Field playerConnection;
    private Class<?> nmsChatSerializer;
    private Class<?> packetType;
    private CMI plugin;

    public TabListHeaderFooterHandler(CMI plugin) {
    }

    public void send(Player receivingPacket, List<String> h, List<String> f) {

    }

    public void send(Player receivingPacket, String header, String footer) {
	
    }

    private void sendPacket(Player player, Object packet) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

    }

    private String getCraftPlayerClasspath() {
	return null;
    }

    private String getPlayerConnectionClasspath() {
	return null;
    }

    private String getNMSPlayerClasspath() {
	return null;
    }

    private String getPacketClasspath() {
	return null;
    }

    private String getChatSerializerClasspath() {
	return null;
    }

    private String getPacketPlayOutPlayerListHeaderFooter() {
	return null;
    }
}
