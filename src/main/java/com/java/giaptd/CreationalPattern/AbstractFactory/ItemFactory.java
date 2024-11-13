package com.java.giaptd.CreationalPattern.AbstractFactory;

public class ItemFactory {
    private ItemFactory() {}

    public static ItemAbstractFactory getFactory(RarityItemType rarityItemType) {
        switch (rarityItemType) {
            case Common:
                return new CommonItemFactory();
            case Rare:
                return new RareItemFactory();
            default:
                throw new IllegalArgumentException("Invalid rarity item type");
        }
    }
}
