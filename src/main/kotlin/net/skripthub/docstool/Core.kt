package net.skripthub.docstool

import net.skripthub.docstool.commands.GenerateDocsCommand
import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class Core: JavaPlugin() {

    companion object {
        var plugin: JavaPlugin? = null
            private set
    }

    override fun onEnable() {
        server.consoleSender.sendMessage("[" + ChatColor.DARK_AQUA + "Skript Hub Docs Tool"
                + ChatColor.RESET + "] " + ChatColor.RED + "For development servers only! Do not run "
                + "this in production!")
        plugin = this
        getCommand("gendocs").executor = GenerateDocsCommand()
        server.consoleSender.sendMessage("[" + ChatColor.DARK_AQUA + "Skript Hub Docs Tool"
                + ChatColor.RESET + "] " + ChatColor.RED + "Skript Hub Docs Tool Enabled")
    }
}