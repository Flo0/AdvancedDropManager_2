package com.gestankbratwurst.advanceddropmanager.drops;

import java.util.Optional;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/*******************************************************
 * Copyright (C) Gestankbratwurst suotokka@gmail.com
 *
 * This file is part of AdvancedDropManager and was created at the 04.10.2020
 *
 * AdvancedDropManager can not be copied and/or distributed without the express
 * permission of the owner.
 *
 */
public class ItemDrop implements DropComponent {

  public ItemDrop(final DropSupplier<ItemStack> dropSupplier) {
    this.dropSupplier = dropSupplier;
  }

  private final DropSupplier<ItemStack> dropSupplier;

  @Override
  public void giveTo(final Player player) {

  }

  @Override
  public void addTo(final Inventory inventory) {

  }

  @Override
  public void dropAt(final Location location) {

  }

  @Override
  public Optional<DropComponent> getParent() {
    return Optional.empty();
  }

  @Override
  public ItemStack getIcon(final Player viewer) {
    return this.dropSupplier.getIcon(viewer);
  }

  @Override
  public boolean test(final Player player) {
    return true;
  }

}
