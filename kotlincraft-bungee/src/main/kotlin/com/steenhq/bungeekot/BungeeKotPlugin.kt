package com.steenhq.bungeekot

import net.md_5.bungee.api.plugin.Plugin

class BungeeKotPlugin : Plugin() {

    override fun onEnable() {
        logger.info("Enabled BungeeKot.")
    }

    override fun onDisable() {
        logger.info("Disabled BungeeKot.")
    }

}