@file:JvmName("PacketUtils")

package me.hexalite.liteware.protocol.utils

import me.hexalite.liteware.protocol.annotations.MinecraftPacketInfo
import me.hexalite.liteware.protocol.packet.MinecraftPacket
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

fun <T : MinecraftPacket> getPacketId(clazz: KClass<T>) = clazz.findAnnotation<MinecraftPacketInfo>()?.id
    ?: error("Target class is not annotated with @MinecraftPacketInfo.")

inline fun <reified T : MinecraftPacket> getPacketId() = getPacketId(T::class)

inline fun MinecraftPacket.id() = getPacketId(this::class)