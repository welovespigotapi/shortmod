package de.welovespigotapi.shortmod.utils.handlers;

import de.welovespigotapi.shortmod.init.ItemInit;
import de.welovespigotapi.shortmod.utils.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/*********************************************************************************
 *   Urheberrechtshinweis                                                        *
 *   Copyright © Maxim E. 2022                                                   *
 *   Erstellt: 06.07.2022 / 23:11                                                *
 *                                                                               *
 *   Alle Inhalte dieses Quelltextes sind urheberrechtlich geschützt.            *
 *   Das Urheberrecht liegt, soweit nicht ausdrücklich anders gekennzeichnet,    *
 *   bei Maxim E. Alle Rechte vorbehalten.                                       *
 *                                                                               *
 *   Jede Art der Vervielfältigung, Verbreitung, Vermietung, Veleihung,          *
 *   öffentlichen Zugänglichmachung oder andere Nutzung                          *
 *   bedarf der ausdrücklichen, schriftlichen Zustimmung von Maxim E.            *
 ********************************************************************************/
@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ItemInit.ITEMS) {
            if(item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }
    }
}
