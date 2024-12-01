package com.java.giaptd.BehavioralPattern.Strategy;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemType {
    private String itemName;
    private int itemPrice;

    public void swap(ItemType otherItemType) {
        ItemType tempItemType = new ItemType(otherItemType.itemName, otherItemType.itemPrice);
        otherItemType.setItemName(itemName);
        otherItemType.setItemPrice(itemPrice);
        itemName = tempItemType.itemName;
        itemPrice = tempItemType.itemPrice;
    }
}
