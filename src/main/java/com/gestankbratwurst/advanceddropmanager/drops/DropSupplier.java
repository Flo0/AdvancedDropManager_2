package com.gestankbratwurst.advanceddropmanager.drops;

import com.gestankbratwurst.advanceddropmanager.ui.UIRepresentable;
import org.bukkit.entity.Player;

/*******************************************************
 * Copyright (C) Gestankbratwurst suotokka@gmail.com
 *
 * This file is part of AdvancedDropManager and was created at the 04.10.2020
 *
 * AdvancedDropManager can not be copied and/or distributed without the express
 * permission of the owner.
 *
 */
public interface DropSupplier<T> extends UIRepresentable {

  T generate(Player player);

}
