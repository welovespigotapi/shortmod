package de.welovespigotapi.shortmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/*********************************************************************************
 *   Urheberrechtshinweis                                                        *
 *   Copyright © Maxim E. 2022                                                   *
 *   Erstellt: 06.07.2022 / 23:05                                                *
 *                                                                               *
 *   Alle Inhalte dieses Quelltextes sind urheberrechtlich geschützt.            *
 *   Das Urheberrecht liegt, soweit nicht ausdrücklich anders gekennzeichnet,    *
 *   bei Maxim E. Alle Rechte vorbehalten.                                       *
 *                                                                               *
 *   Jede Art der Vervielfältigung, Verbreitung, Vermietung, Veleihung,          *
 *   öffentlichen Zugänglichmachung oder andere Nutzung                          *
 *   bedarf der ausdrücklichen, schriftlichen Zustimmung von Maxim E.            *
 ********************************************************************************/
public class ClientProxy extends CommonProxy {

    @Override
    public void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
