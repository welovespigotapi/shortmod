package de.welovespigotapi.shortmod.objects.items;

import de.welovespigotapi.shortmod.ShortMod;
import de.welovespigotapi.shortmod.init.ItemInit;
import de.welovespigotapi.shortmod.proxy.ClientProxy;
import de.welovespigotapi.shortmod.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/*********************************************************************************
 *   Urheberrechtshinweis                                                        *
 *   Copyright © Maxim E. 2022                                                   *
 *   Erstellt: 06.07.2022 / 23:08                                                *
 *                                                                               *
 *   Alle Inhalte dieses Quelltextes sind urheberrechtlich geschützt.            *
 *   Das Urheberrecht liegt, soweit nicht ausdrücklich anders gekennzeichnet,    *
 *   bei Maxim E. Alle Rechte vorbehalten.                                       *
 *                                                                               *
 *   Jede Art der Vervielfältigung, Verbreitung, Vermietung, Veleihung,          *
 *   öffentlichen Zugänglichmachung oder andere Nutzung                          *
 *   bedarf der ausdrücklichen, schriftlichen Zustimmung von Maxim E.            *
 ********************************************************************************/
public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ShortMod.proxy.registerModel(this, 0);
    }
}
