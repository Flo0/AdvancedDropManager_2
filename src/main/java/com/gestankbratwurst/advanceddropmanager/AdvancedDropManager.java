package com.gestankbratwurst.advanceddropmanager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedDropManager extends JavaPlugin {

  @Override
  public void onEnable() {

    Bukkit.getPluginManager().registerEvents(listener, plugin);

  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
