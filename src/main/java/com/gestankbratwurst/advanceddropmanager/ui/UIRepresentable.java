package com.gestankbratwurst.advanceddropmanager.ui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/*******************************************************
 * Copyright (C) Gestankbratwurst suotokka@gmail.com
 *
 * This file is part of AdvancedDropManager and was created at the 11.10.2020
 *
 * AdvancedDropManager can not be copied and/or distributed without the express
 * permission of the owner.
 *
 */
public interface UIRepresentable {

  ItemStack getIcon(Player viewer);
  
}
