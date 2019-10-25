package com.steenhq.bukkot

import org.bukkit.plugin.java.JavaPlugin

class BukkotPlugin : JavaPlugin() {

    override fun onEnable() {
        logger.info("Enabled Bukkot.")
    }

    override fun onDisable() {
        logger.info("Disabled Bukkot.")
    }
}

