package com.gestankbratwurst.advanceddropmanager.drops;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
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
public class DropTable implements DropComponent {

  private final Set<DropComponent> dropComponentSet;

  public DropTable() {
    this.dropComponentSet = new HashSet<>();

  }

  @Override
  public void giveTo(final Player player) {
    for (final DropComponent component : this.dropComponentSet) {
      component.giveTo(player);
    }
  }

  @Override
  public void addTo(final Inventory inventory) {
    for (final DropComponent component : this.dropComponentSet) {
      component.addTo(inventory);
    }
  }

  @Override
  public void dropAt(final Location location) {
    for (final DropComponent component : this.dropComponentSet) {
      component.dropAt(location);
    }
  }

  @Override
  public Optional<DropComponent> getParent() {
    return Optional.empty();
  }

  @Override
  public boolean test(final Player player) {
    return false;
  }

}
