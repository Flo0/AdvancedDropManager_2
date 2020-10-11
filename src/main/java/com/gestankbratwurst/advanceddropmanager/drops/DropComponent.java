package com.gestankbratwurst.advanceddropmanager.drops;

import com.gestankbratwurst.advanceddropmanager.conditions.DropCondition;
import com.gestankbratwurst.advanceddropmanager.ui.UIRepresentable;
import java.util.Optional;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/*******************************************************
 * Copyright (C) Gestankbratwurst suotokka@gmail.com
 *
 * This file is part of AdvancedDropManager and was created at the 04.10.2020
 *
 * AdvancedDropManager can not be copied and/or distributed without the express
 * permission of the owner.
 *
 */
public interface DropComponent extends DropCondition, UIRepresentable {

  void giveTo(Player player);

  void addTo(Inventory inventory);

  void dropAt(Location location);

  Optional<DropComponent> getParent();

}
