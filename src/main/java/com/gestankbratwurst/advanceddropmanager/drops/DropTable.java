package com.gestankbratwurst.advanceddropmanager.drops;

import com.gestankbratwurst.advanceddropmanager.conditions.DropCondition;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
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
public class DropTable implements DropComponent {

  private final Set<DropComponent> dropComponents;
  private final Set<DropCondition> dropConditions;
  @Getter
  @Setter
  private boolean replaceVanilla = false;

  public DropTable() {
    this.dropComponents = new HashSet<>();
    this.dropConditions = new HashSet<>();
  }

  public <T extends DropComponent> Set<T> getSubComponents(final Class<T> componentClass) {
    return this.dropComponents.stream()
        .filter(componentClass::isInstance)
        .map(componentClass::cast)
        .collect(Collectors.toSet());
  }

  public boolean addCondition(final DropCondition condition) {
    return this.dropConditions.add(condition);
  }

  public boolean removeCondition(final DropCondition condition) {
    return this.dropConditions.remove(condition);
  }

  public boolean addComponent(final DropComponent component) {
    return this.dropComponents.add(component);
  }

  public boolean removeComponent(final DropComponent component) {
    return this.dropComponents.remove(component);
  }

  @Override
  public void giveTo(final Player player) {
    for (final DropComponent component : this.dropComponents) {
      component.giveTo(player);
    }
  }

  @Override
  public void addTo(final Inventory inventory) {
    for (final DropComponent component : this.dropComponents) {
      component.addTo(inventory);
    }
  }

  @Override
  public void dropAt(final Location location) {
    for (final DropComponent component : this.dropComponents) {
      component.dropAt(location);
    }
  }

  @Override
  public Optional<DropComponent> getParent() {
    return Optional.empty();
  }

  @Override
  public boolean test(final Player player) {
    for (final DropCondition condition : this.dropConditions) {
      if (!condition.test(player)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public ItemStack getIcon(final Player viewer) {
    // TODO return icon
    return null;
  }

}
