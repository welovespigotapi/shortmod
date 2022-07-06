package de.welovespigotapi.shortmod.init;

import de.welovespigotapi.shortmod.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

/*********************************************************************************
 *   Urheberrechtshinweis                                                        *
 *   Copyright © Maxim E. 2022                                                   *
 *   Erstellt: 06.07.2022 / 23:07                                                *
 *                                                                               *
 *   Alle Inhalte dieses Quelltextes sind urheberrechtlich geschützt.            *
 *   Das Urheberrecht liegt, soweit nicht ausdrücklich anders gekennzeichnet,    *
 *   bei Maxim E. Alle Rechte vorbehalten.                                       *
 *                                                                               *
 *   Jede Art der Vervielfältigung, Verbreitung, Vermietung, Veleihung,          *
 *   öffentlichen Zugänglichmachung oder andere Nutzung                          *
 *   bedarf der ausdrücklichen, schriftlichen Zustimmung von Maxim E.            *
 ********************************************************************************/
public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
}
